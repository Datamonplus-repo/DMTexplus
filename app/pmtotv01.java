package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtotv01 extends GXProcedure
{
   public pmtotv01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtotv01.class ), "" );
   }

   public pmtotv01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public com.genexus.util.GXFile executeUdp( String[] aP0 )
   {
      pmtotv01.this.aP1 = new com.genexus.util.GXFile[] {new com.genexus.util.GXFile()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        com.genexus.util.GXFile[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             com.genexus.util.GXFile[] aP1 )
   {
      pmtotv01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtotv01.this.AV8File = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9NomInf = httpContext.getMessage( "MAQUINASPLN.txt", "") ;
      AV8File.setSource( GXutil.trim( AV9NomInf) );
      if ( AV8File.exists() )
      {
         AV8File.delete();
      }
      AV8File.openWrite("");
      /* Using cursor P084Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9445OMEst = P084Q2_A9445OMEst[0] ;
         A9436OMFchCre = P084Q2_A9436OMFchCre[0] ;
         A9425OMCod = P084Q2_A9425OMCod[0] ;
         A9426OMMaqCod = P084Q2_A9426OMMaqCod[0] ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            AV12Texto = GXutil.padr( A9426OMMaqCod, 6, GXutil.space( (short)(1))) + GXutil.padr( GXutil.str( A9425OMCod, 8, 0), 8, GXutil.space( (short)(1))) + GXutil.trim( localUtil.ttoc( A9436OMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
            AV8File.writeLine(AV12Texto);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12Texto = httpContext.getMessage( "FIN", "") ;
      AV8File.writeLine(AV12Texto);
      AV8File.close();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtotv01.this.A396EmprCod;
      this.aP1[0] = pmtotv01.this.AV8File;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9NomInf = "" ;
      scmdbuf = "" ;
      P084Q2_A396EmprCod = new String[] {""} ;
      P084Q2_A9445OMEst = new String[] {""} ;
      P084Q2_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P084Q2_A9425OMCod = new int[1] ;
      P084Q2_A9426OMMaqCod = new String[] {""} ;
      A9445OMEst = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9426OMMaqCod = "" ;
      AV12Texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtotv01__default(),
         new Object[] {
             new Object[] {
            P084Q2_A396EmprCod, P084Q2_A9445OMEst, P084Q2_A9436OMFchCre, P084Q2_A9425OMCod, P084Q2_A9426OMMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9425OMCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private java.util.Date A9436OMFchCre ;
   private String AV9NomInf ;
   private String AV12Texto ;
   private com.genexus.util.GXFile[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P084Q2_A396EmprCod ;
   private String[] P084Q2_A9445OMEst ;
   private java.util.Date[] P084Q2_A9436OMFchCre ;
   private int[] P084Q2_A9425OMCod ;
   private String[] P084Q2_A9426OMMaqCod ;
   private com.genexus.util.GXFile AV8File ;
}

final  class pmtotv01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084Q2", "SELECT EmprCod, OMEst, OMFchCre, OMCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? ORDER BY EmprCod, OMMaqCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

