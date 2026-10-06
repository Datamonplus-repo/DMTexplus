package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofordsc extends GXProcedure
{
   public pprofordsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofordsc.class ), "" );
   }

   public pprofordsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pprofordsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pprofordsc.this.A396EmprCod = aP0;
      pprofordsc.this.A764ProForCod = aP1;
      pprofordsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProForDsc = "" ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P03XR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A766ProForDsc = P03XR2_A766ProForDsc[0] ;
         AV11GXLvl3 = (byte)(1) ;
         AV8ProForDsc = A766ProForDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8ProForDsc = httpContext.getMessage( "No existe proceso quimico", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pprofordsc.this.AV8ProForDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ProForDsc = "" ;
      scmdbuf = "" ;
      P03XR2_A396EmprCod = new String[] {""} ;
      P03XR2_A764ProForCod = new String[] {""} ;
      P03XR2_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofordsc__default(),
         new Object[] {
             new Object[] {
            P03XR2_A396EmprCod, P03XR2_A764ProForCod, P03XR2_A766ProForDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV8ProForDsc ;
   private String scmdbuf ;
   private String A766ProForDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03XR2_A396EmprCod ;
   private String[] P03XR2_A764ProForCod ;
   private String[] P03XR2_A766ProForDsc ;
}

final  class pprofordsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03XR2", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

