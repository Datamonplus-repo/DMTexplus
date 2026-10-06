package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc97 extends GXProcedure
{
   public pprc97( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc97.class ), "" );
   }

   public pprc97( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pprc97.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc97.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc97.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprc97.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pprc97.this.A4058CCFColNom = aP3[0];
      this.aP3 = aP3;
      pprc97.this.A4059CCFColNum = aP4[0];
      this.aP4 = aP4;
      pprc97.this.AV8usurcod = aP5[0];
      this.aP5 = aP5;
      pprc97.this.AV9station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05HV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P05HV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4031CCTCod = P05HV3_A4031CCTCod[0] ;
            /* Using cursor P05HV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4034CCTLin = P05HV4_A4034CCTLin[0] ;
               /* Using cursor P05HV5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
               AV10inc_obs = httpContext.getMessage( "Eliminacion tabla CCSTA", "") + GXutil.newLine( ) ;
               AV10inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
               AV10inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
               AV10inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
               AV10inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
               AV10inc_obs += httpContext.getMessage( "Codigo  ", "") + GXutil.str( A4031CCTCod, 6, 0) + GXutil.newLine( ) ;
               AV10inc_obs += httpContext.getMessage( "Linea   ", "") + GXutil.str( A4034CCTLin, 4, 0) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV8usurcod, AV9station, AV10inc_obs, 99999999, (byte)(0), "") ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV10inc_obs = httpContext.getMessage( "Eliminacion tabla CCSER1", "") + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
            AV10inc_obs += httpContext.getMessage( "Codigo  ", "") + GXutil.str( A4031CCTCod, 6, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV8usurcod, AV9station, AV10inc_obs, 99999999, (byte)(0), "") ;
            /* Using cursor P05HV6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV10inc_obs = httpContext.getMessage( "Eliminacion tabla CCSERI", "") + GXutil.newLine( ) ;
         AV10inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
         AV10inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
         AV10inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
         AV10inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV8usurcod, AV9station, AV10inc_obs, 99999999, (byte)(0), "") ;
         /* Using cursor P05HV7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSeri");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc97.this.A396EmprCod;
      this.aP1[0] = pprc97.this.A252CliCod;
      this.aP2[0] = pprc97.this.A65ArtCod;
      this.aP3[0] = pprc97.this.A4058CCFColNom;
      this.aP4[0] = pprc97.this.A4059CCFColNum;
      this.aP5[0] = pprc97.this.AV8usurcod;
      this.aP6[0] = pprc97.this.AV9station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc97");
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
      P05HV2_A396EmprCod = new String[] {""} ;
      P05HV2_A252CliCod = new int[1] ;
      P05HV2_A65ArtCod = new String[] {""} ;
      P05HV2_A4058CCFColNom = new String[] {""} ;
      P05HV2_A4059CCFColNum = new int[1] ;
      P05HV3_A396EmprCod = new String[] {""} ;
      P05HV3_A252CliCod = new int[1] ;
      P05HV3_A65ArtCod = new String[] {""} ;
      P05HV3_A4058CCFColNom = new String[] {""} ;
      P05HV3_A4059CCFColNum = new int[1] ;
      P05HV3_A4031CCTCod = new int[1] ;
      P05HV4_A396EmprCod = new String[] {""} ;
      P05HV4_A252CliCod = new int[1] ;
      P05HV4_A65ArtCod = new String[] {""} ;
      P05HV4_A4058CCFColNom = new String[] {""} ;
      P05HV4_A4059CCFColNum = new int[1] ;
      P05HV4_A4031CCTCod = new int[1] ;
      P05HV4_A4034CCTLin = new short[1] ;
      AV10inc_obs = "" ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc97__default(),
         new Object[] {
             new Object[] {
            P05HV2_A396EmprCod, P05HV2_A252CliCod, P05HV2_A65ArtCod, P05HV2_A4058CCFColNom, P05HV2_A4059CCFColNum
            }
            , new Object[] {
            P05HV3_A396EmprCod, P05HV3_A252CliCod, P05HV3_A65ArtCod, P05HV3_A4058CCFColNom, P05HV3_A4059CCFColNum, P05HV3_A4031CCTCod
            }
            , new Object[] {
            P05HV4_A396EmprCod, P05HV4_A252CliCod, P05HV4_A65ArtCod, P05HV4_A4058CCFColNom, P05HV4_A4059CCFColNum, P05HV4_A4031CCTCod, P05HV4_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PPrc97" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PPrc97" ;
      Gx_err = (short)(0) ;
   }

   private short A4034CCTLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String AV8usurcod ;
   private String AV9station ;
   private String scmdbuf ;
   private String AV16Pgmname ;
   private String AV10inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05HV2_A396EmprCod ;
   private int[] P05HV2_A252CliCod ;
   private String[] P05HV2_A65ArtCod ;
   private String[] P05HV2_A4058CCFColNom ;
   private int[] P05HV2_A4059CCFColNum ;
   private String[] P05HV3_A396EmprCod ;
   private int[] P05HV3_A252CliCod ;
   private String[] P05HV3_A65ArtCod ;
   private String[] P05HV3_A4058CCFColNom ;
   private int[] P05HV3_A4059CCFColNum ;
   private int[] P05HV3_A4031CCTCod ;
   private String[] P05HV4_A396EmprCod ;
   private int[] P05HV4_A252CliCod ;
   private String[] P05HV4_A65ArtCod ;
   private String[] P05HV4_A4058CCFColNom ;
   private int[] P05HV4_A4059CCFColNum ;
   private int[] P05HV4_A4031CCTCod ;
   private short[] P05HV4_A4034CCTLin ;
}

final  class pprc97__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05HV2", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05HV3", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05HV4", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05HV5", "DELETE FROM TXPCCSta  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSta")
         ,new UpdateCursor("P05HV6", "DELETE FROM TXPCCSer1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
         ,new UpdateCursor("P05HV7", "DELETE FROM TXPCCSeri  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSeri")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

