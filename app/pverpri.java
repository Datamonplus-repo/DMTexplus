package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pverpri extends GXProcedure
{
   public pverpri( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pverpri.class ), "" );
   }

   public pverpri( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pverpri.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pverpri.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pverpri.this.AV9GuiRemCli = aP1[0];
      this.aP1 = aP1;
      pverpri.this.AV10AlbProPri = aP2[0];
      this.aP2 = aP2;
      pverpri.this.AV12ALbSec = aP3[0];
      this.aP3 = aP3;
      pverpri.this.AV11Correcto = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Correcto = httpContext.getMessage( "SI", "") ;
      /* Using cursor P01ZL2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9GuiRemCli)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01ZL2_A252CliCod[0] ;
         A396EmprCod = P01ZL2_A396EmprCod[0] ;
         A858ZonGeoCod = P01ZL2_A858ZonGeoCod[0] ;
         if ( ( GXutil.strcmp(AV12ALbSec, httpContext.getMessage( "A", "")) == 0 ) && ( A858ZonGeoCod == 999 ) )
         {
            AV11Correcto = httpContext.getMessage( "NO", "") ;
         }
         else if ( ( GXutil.strcmp(AV12ALbSec, httpContext.getMessage( "B", "")) == 0 ) && ( A858ZonGeoCod != 999 ) )
         {
            AV11Correcto = httpContext.getMessage( "NO", "") ;
         }
         else if ( ( GXutil.strcmp(AV12ALbSec, httpContext.getMessage( "C", "")) == 0 ) && ( A858ZonGeoCod == 999 ) )
         {
            AV11Correcto = httpContext.getMessage( "NO", "") ;
         }
         else if ( ( GXutil.strcmp(AV12ALbSec, httpContext.getMessage( "D", "")) == 0 ) && ( A858ZonGeoCod != 999 ) )
         {
            AV11Correcto = httpContext.getMessage( "NO", "") ;
         }
         else
         {
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pverpri.this.AV8EmprCod;
      this.aP1[0] = pverpri.this.AV9GuiRemCli;
      this.aP2[0] = pverpri.this.AV10AlbProPri;
      this.aP3[0] = pverpri.this.AV12ALbSec;
      this.aP4[0] = pverpri.this.AV11Correcto;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01ZL2_A252CliCod = new int[1] ;
      P01ZL2_A396EmprCod = new String[] {""} ;
      P01ZL2_A858ZonGeoCod = new short[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pverpri__default(),
         new Object[] {
             new Object[] {
            P01ZL2_A252CliCod, P01ZL2_A396EmprCod, P01ZL2_A858ZonGeoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A858ZonGeoCod ;
   private short Gx_err ;
   private int AV9GuiRemCli ;
   private int A252CliCod ;
   private String AV8EmprCod ;
   private String AV10AlbProPri ;
   private String AV12ALbSec ;
   private String AV11Correcto ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P01ZL2_A252CliCod ;
   private String[] P01ZL2_A396EmprCod ;
   private short[] P01ZL2_A858ZonGeoCod ;
}

final  class pverpri__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ZL2", "SELECT CliCod, EmprCod, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

