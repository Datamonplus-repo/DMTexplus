package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc96 extends GXProcedure
{
   public pprc96( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc96.class ), "" );
   }

   public pprc96( int remoteHandle ,
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
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pprc96.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pprc96.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc96.this.AV19CliCod = aP1[0];
      this.aP1 = aP1;
      pprc96.this.AV18ArtCod = aP2[0];
      this.aP2 = aP2;
      pprc96.this.AV17CCFColNom = aP3[0];
      this.aP3 = aP3;
      pprc96.this.AV16CCFColNum = aP4[0];
      this.aP4 = aP4;
      pprc96.this.AV15CCTCod = aP5[0];
      this.aP5 = aP5;
      pprc96.this.AV12usurcod = aP6[0];
      this.aP6 = aP6;
      pprc96.this.AV13station = aP7[0];
      this.aP7 = aP7;
      pprc96.this.AV20Op = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV20Op, httpContext.getMessage( "B", "")) == 0 )
      {
         /* Using cursor P05HU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCod), AV18ArtCod, AV17CCFColNom, Integer.valueOf(AV16CCFColNum), Integer.valueOf(AV15CCTCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4031CCTCod = P05HU2_A4031CCTCod[0] ;
            A4059CCFColNum = P05HU2_A4059CCFColNum[0] ;
            A4058CCFColNom = P05HU2_A4058CCFColNom[0] ;
            A65ArtCod = P05HU2_A65ArtCod[0] ;
            A252CliCod = P05HU2_A252CliCod[0] ;
            /* Using cursor P05HU3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4034CCTLin = P05HU3_A4034CCTLin[0] ;
               /* Using cursor P05HU4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
               AV14inc_obs = httpContext.getMessage( "OpcionB.Eliminacion tabla CCSTA", "") + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Codigo  ", "") + GXutil.str( A4031CCTCod, 6, 0) + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Linea   ", "") + GXutil.str( A4034CCTLin, 4, 0) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV12usurcod, AV13station, AV14inc_obs, 99999999, (byte)(0), "") ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV14inc_obs = httpContext.getMessage( "OpcionB.Eliminacion tabla CCSER1", "") + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Codigo  ", "") + GXutil.str( A4031CCTCod, 6, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV12usurcod, AV13station, AV14inc_obs, 99999999, (byte)(0), "") ;
            /* Using cursor P05HU5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(AV20Op, httpContext.getMessage( "A", "")) == 0 )
      {
         /* Using cursor P05HU6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV19CliCod), Integer.valueOf(AV15CCTCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A4031CCTCod = P05HU6_A4031CCTCod[0] ;
            A4059CCFColNum = P05HU6_A4059CCFColNum[0] ;
            A4058CCFColNom = P05HU6_A4058CCFColNom[0] ;
            A65ArtCod = P05HU6_A65ArtCod[0] ;
            A252CliCod = P05HU6_A252CliCod[0] ;
            /* Using cursor P05HU7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A4034CCTLin = P05HU7_A4034CCTLin[0] ;
               /* Using cursor P05HU8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
               AV14inc_obs = httpContext.getMessage( "OpcionA.Eliminacion tabla CCSTA", "") + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Codigo  ", "") + GXutil.str( A4031CCTCod, 6, 0) + GXutil.newLine( ) ;
               AV14inc_obs += httpContext.getMessage( "Linea   ", "") + GXutil.str( A4034CCTLin, 4, 0) + GXutil.newLine( ) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV12usurcod, AV13station, AV14inc_obs, 99999999, (byte)(0), "") ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV14inc_obs = httpContext.getMessage( "OpcionA.Eliminacion tabla CCSER1", "") + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Articulo", "") + A65ArtCod + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Color   ", "") + A4058CCFColNom + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Numero  ", "") + GXutil.str( A4059CCFColNum, 6, 0) + GXutil.newLine( ) ;
            AV14inc_obs += httpContext.getMessage( "Codigo  ", "") + GXutil.str( A4031CCTCod, 6, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV12usurcod, AV13station, AV14inc_obs, 99999999, (byte)(0), "") ;
            /* Using cursor P05HU9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc96.this.A396EmprCod;
      this.aP1[0] = pprc96.this.AV19CliCod;
      this.aP2[0] = pprc96.this.AV18ArtCod;
      this.aP3[0] = pprc96.this.AV17CCFColNom;
      this.aP4[0] = pprc96.this.AV16CCFColNum;
      this.aP5[0] = pprc96.this.AV15CCTCod;
      this.aP6[0] = pprc96.this.AV12usurcod;
      this.aP7[0] = pprc96.this.AV13station;
      this.aP8[0] = pprc96.this.AV20Op;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc96");
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
      P05HU2_A396EmprCod = new String[] {""} ;
      P05HU2_A4031CCTCod = new int[1] ;
      P05HU2_A4059CCFColNum = new int[1] ;
      P05HU2_A4058CCFColNom = new String[] {""} ;
      P05HU2_A65ArtCod = new String[] {""} ;
      P05HU2_A252CliCod = new int[1] ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      P05HU3_A396EmprCod = new String[] {""} ;
      P05HU3_A252CliCod = new int[1] ;
      P05HU3_A65ArtCod = new String[] {""} ;
      P05HU3_A4058CCFColNom = new String[] {""} ;
      P05HU3_A4059CCFColNum = new int[1] ;
      P05HU3_A4031CCTCod = new int[1] ;
      P05HU3_A4034CCTLin = new short[1] ;
      AV14inc_obs = "" ;
      AV25Pgmname = "" ;
      P05HU6_A396EmprCod = new String[] {""} ;
      P05HU6_A4031CCTCod = new int[1] ;
      P05HU6_A4059CCFColNum = new int[1] ;
      P05HU6_A4058CCFColNom = new String[] {""} ;
      P05HU6_A65ArtCod = new String[] {""} ;
      P05HU6_A252CliCod = new int[1] ;
      P05HU7_A396EmprCod = new String[] {""} ;
      P05HU7_A252CliCod = new int[1] ;
      P05HU7_A65ArtCod = new String[] {""} ;
      P05HU7_A4058CCFColNom = new String[] {""} ;
      P05HU7_A4059CCFColNum = new int[1] ;
      P05HU7_A4031CCTCod = new int[1] ;
      P05HU7_A4034CCTLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc96__default(),
         new Object[] {
             new Object[] {
            P05HU2_A396EmprCod, P05HU2_A4031CCTCod, P05HU2_A4059CCFColNum, P05HU2_A4058CCFColNom, P05HU2_A65ArtCod, P05HU2_A252CliCod
            }
            , new Object[] {
            P05HU3_A396EmprCod, P05HU3_A252CliCod, P05HU3_A65ArtCod, P05HU3_A4058CCFColNom, P05HU3_A4059CCFColNum, P05HU3_A4031CCTCod, P05HU3_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05HU6_A396EmprCod, P05HU6_A4031CCTCod, P05HU6_A4059CCFColNum, P05HU6_A4058CCFColNom, P05HU6_A65ArtCod, P05HU6_A252CliCod
            }
            , new Object[] {
            P05HU7_A396EmprCod, P05HU7_A252CliCod, P05HU7_A65ArtCod, P05HU7_A4058CCFColNom, P05HU7_A4059CCFColNum, P05HU7_A4031CCTCod, P05HU7_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "PPrc96" ;
      /* GeneXus formulas. */
      AV25Pgmname = "PPrc96" ;
      Gx_err = (short)(0) ;
   }

   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV19CliCod ;
   private int AV16CCFColNum ;
   private int AV15CCTCod ;
   private int A4031CCTCod ;
   private int A4059CCFColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV18ArtCod ;
   private String AV17CCFColNom ;
   private String AV12usurcod ;
   private String AV13station ;
   private String AV20Op ;
   private String scmdbuf ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String AV25Pgmname ;
   private String AV14inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05HU2_A396EmprCod ;
   private int[] P05HU2_A4031CCTCod ;
   private int[] P05HU2_A4059CCFColNum ;
   private String[] P05HU2_A4058CCFColNom ;
   private String[] P05HU2_A65ArtCod ;
   private int[] P05HU2_A252CliCod ;
   private String[] P05HU3_A396EmprCod ;
   private int[] P05HU3_A252CliCod ;
   private String[] P05HU3_A65ArtCod ;
   private String[] P05HU3_A4058CCFColNom ;
   private int[] P05HU3_A4059CCFColNum ;
   private int[] P05HU3_A4031CCTCod ;
   private short[] P05HU3_A4034CCTLin ;
   private String[] P05HU6_A396EmprCod ;
   private int[] P05HU6_A4031CCTCod ;
   private int[] P05HU6_A4059CCFColNum ;
   private String[] P05HU6_A4058CCFColNom ;
   private String[] P05HU6_A65ArtCod ;
   private int[] P05HU6_A252CliCod ;
   private String[] P05HU7_A396EmprCod ;
   private int[] P05HU7_A252CliCod ;
   private String[] P05HU7_A65ArtCod ;
   private String[] P05HU7_A4058CCFColNom ;
   private int[] P05HU7_A4059CCFColNum ;
   private int[] P05HU7_A4031CCTCod ;
   private short[] P05HU7_A4034CCTLin ;
}

final  class pprc96__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05HU2", "SELECT EmprCod, CCTCod, CCFColNum, CCFColNom, ArtCod, CliCod FROM TXPCCSer1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05HU3", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05HU4", "DELETE FROM TXPCCSta  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSta")
         ,new UpdateCursor("P05HU5", "DELETE FROM TXPCCSer1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
         ,new ForEachCursor("P05HU6", "SELECT EmprCod, CCTCod, CCFColNum, CCFColNom, ArtCod, CliCod FROM TXPCCSer1 WHERE (EmprCod = ? and CliCod = ?) AND (CCTCod = ?) ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05HU7", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05HU8", "DELETE FROM TXPCCSta  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSta")
         ,new UpdateCursor("P05HU9", "DELETE FROM TXPCCSer1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

