package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdatbot extends GXProcedure
{
   public pdatbot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdatbot.class ), "" );
   }

   public pdatbot( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           int[] aP7 ,
                           short[] aP8 ,
                           java.math.BigDecimal[] aP9 ,
                           short[] aP10 ,
                           int[] aP11 ,
                           short[] aP12 )
   {
      pdatbot.this.aP13 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        short[] aP10 ,
                        int[] aP11 ,
                        short[] aP12 ,
                        byte[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             short[] aP10 ,
                             int[] aP11 ,
                             short[] aP12 ,
                             byte[] aP13 )
   {
      pdatbot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdatbot.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdatbot.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdatbot.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdatbot.this.AV9BotCliCod = aP4[0];
      this.aP4 = aP4;
      pdatbot.this.AV10BotSer = aP5[0];
      this.aP5 = aP5;
      pdatbot.this.AV11BotColNom = aP6[0];
      this.aP6 = aP6;
      pdatbot.this.AV12BotColNum = aP7[0];
      this.aP7 = aP7;
      pdatbot.this.AV13BotAnc = aP8[0];
      this.aP8 = aP8;
      pdatbot.this.AV14BotMts = aP9[0];
      this.aP9 = aP9;
      pdatbot.this.AV15BotPml = aP10[0];
      this.aP10 = aP10;
      pdatbot.this.AV16CodBota = aP11[0];
      this.aP11 = aP11;
      pdatbot.this.AV17BotLin = aP12[0];
      this.aP12 = aP12;
      pdatbot.this.AV8FlagBot = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagBot = (byte)(0) ;
      /* Using cursor P00I53 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00I53_A252CliCod[0] ;
         n252CliCod = P00I53_n252CliCod[0] ;
         A212BarSer = P00I53_A212BarSer[0] ;
         A135BarColNom = P00I53_A135BarColNom[0] ;
         A136BarColNum = P00I53_A136BarColNum[0] ;
         A125BarAncAca1 = P00I53_A125BarAncAca1[0] ;
         A864BarPes = P00I53_A864BarPes[0] ;
         A184BarMtr = P00I53_A184BarMtr[0] ;
         n184BarMtr = P00I53_n184BarMtr[0] ;
         A184BarMtr = P00I53_A184BarMtr[0] ;
         n184BarMtr = P00I53_n184BarMtr[0] ;
         AV9BotCliCod = A252CliCod ;
         AV10BotSer = A212BarSer ;
         AV11BotColNom = A135BarColNom ;
         AV12BotColNum = A136BarColNum ;
         AV13BotAnc = A125BarAncAca1 ;
         AV14BotMts = A184BarMtr ;
         AV15BotPml = A864BarPes ;
         AV8FlagBot = (byte)(1) ;
         /* Using cursor P00I54 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkI53 = false ;
            A44AlbRecCod = P00I54_A44AlbRecCod[0] ;
            A1501BarPiePie = P00I54_A1501BarPiePie[0] ;
            A200BarPieCod = P00I54_A200BarPieCod[0] ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00I54_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00I54_A129BarCod[0] == A129BarCod ) && ( P00I54_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P00I54_A130BarCodPar[0], A130BarCodPar) == 0 ) )
            {
               if ( ! ( ( P00I54_A44AlbRecCod[0] == A44AlbRecCod ) ) )
               {
                  if (true) break;
               }
               brkI53 = false ;
               A200BarPieCod = P00I54_A200BarPieCod[0] ;
               brkI53 = true ;
               pr_default.readNext(1);
            }
            /*
               INSERT RECORD ON TABLE TXPBOTALB

            */
            A2855CodBota = AV16CodBota ;
            A2859BotLin = AV17BotLin ;
            A2869BotAlbRec = A44AlbRecCod ;
            /* Using cursor P00I55 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2855CodBota), Short.valueOf(A2859BotLin), Integer.valueOf(A2869BotAlbRec)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBOTALB");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            if ( ! brkI53 )
            {
               brkI53 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdatbot.this.A396EmprCod;
      this.aP1[0] = pdatbot.this.A129BarCod;
      this.aP2[0] = pdatbot.this.A132BarCodReo;
      this.aP3[0] = pdatbot.this.A130BarCodPar;
      this.aP4[0] = pdatbot.this.AV9BotCliCod;
      this.aP5[0] = pdatbot.this.AV10BotSer;
      this.aP6[0] = pdatbot.this.AV11BotColNom;
      this.aP7[0] = pdatbot.this.AV12BotColNum;
      this.aP8[0] = pdatbot.this.AV13BotAnc;
      this.aP9[0] = pdatbot.this.AV14BotMts;
      this.aP10[0] = pdatbot.this.AV15BotPml;
      this.aP11[0] = pdatbot.this.AV16CodBota;
      this.aP12[0] = pdatbot.this.AV17BotLin;
      this.aP13[0] = pdatbot.this.AV8FlagBot;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdatbot");
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
      P00I53_A396EmprCod = new String[] {""} ;
      P00I53_A129BarCod = new int[1] ;
      P00I53_A132BarCodReo = new byte[1] ;
      P00I53_A130BarCodPar = new String[] {""} ;
      P00I53_A252CliCod = new int[1] ;
      P00I53_n252CliCod = new boolean[] {false} ;
      P00I53_A212BarSer = new String[] {""} ;
      P00I53_A135BarColNom = new String[] {""} ;
      P00I53_A136BarColNum = new int[1] ;
      P00I53_A125BarAncAca1 = new short[1] ;
      P00I53_A864BarPes = new short[1] ;
      P00I53_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00I53_n184BarMtr = new boolean[] {false} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      P00I54_A396EmprCod = new String[] {""} ;
      P00I54_A129BarCod = new int[1] ;
      P00I54_A132BarCodReo = new byte[1] ;
      P00I54_A130BarCodPar = new String[] {""} ;
      P00I54_A44AlbRecCod = new int[1] ;
      P00I54_A1501BarPiePie = new int[1] ;
      P00I54_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdatbot__default(),
         new Object[] {
             new Object[] {
            P00I53_A396EmprCod, P00I53_A129BarCod, P00I53_A132BarCodReo, P00I53_A130BarCodPar, P00I53_A252CliCod, P00I53_n252CliCod, P00I53_A212BarSer, P00I53_A135BarColNom, P00I53_A136BarColNum, P00I53_A125BarAncAca1,
            P00I53_A864BarPes, P00I53_A184BarMtr, P00I53_n184BarMtr
            }
            , new Object[] {
            P00I54_A396EmprCod, P00I54_A129BarCod, P00I54_A132BarCodReo, P00I54_A130BarCodPar, P00I54_A44AlbRecCod, P00I54_A1501BarPiePie, P00I54_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8FlagBot ;
   private short AV13BotAnc ;
   private short AV15BotPml ;
   private short AV17BotLin ;
   private short A125BarAncAca1 ;
   private short A864BarPes ;
   private short A2859BotLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9BotCliCod ;
   private int AV12BotColNum ;
   private int AV16CodBota ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int GX_INS420 ;
   private int A2855CodBota ;
   private int A2869BotAlbRec ;
   private java.math.BigDecimal AV14BotMts ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10BotSer ;
   private String AV11BotColNom ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A200BarPieCod ;
   private String Gx_emsg ;
   private boolean n252CliCod ;
   private boolean n184BarMtr ;
   private boolean brkI53 ;
   private byte[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private short[] aP10 ;
   private int[] aP11 ;
   private short[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00I53_A396EmprCod ;
   private int[] P00I53_A129BarCod ;
   private byte[] P00I53_A132BarCodReo ;
   private String[] P00I53_A130BarCodPar ;
   private int[] P00I53_A252CliCod ;
   private boolean[] P00I53_n252CliCod ;
   private String[] P00I53_A212BarSer ;
   private String[] P00I53_A135BarColNom ;
   private int[] P00I53_A136BarColNum ;
   private short[] P00I53_A125BarAncAca1 ;
   private short[] P00I53_A864BarPes ;
   private java.math.BigDecimal[] P00I53_A184BarMtr ;
   private boolean[] P00I53_n184BarMtr ;
   private String[] P00I54_A396EmprCod ;
   private int[] P00I54_A129BarCod ;
   private byte[] P00I54_A132BarCodReo ;
   private String[] P00I54_A130BarCodPar ;
   private int[] P00I54_A44AlbRecCod ;
   private int[] P00I54_A1501BarPiePie ;
   private String[] P00I54_A200BarPieCod ;
}

final  class pdatbot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00I53", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarAncAca1, T1.BarPes, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00I54", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPiePie, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00I55", "INSERT INTO TXPBOTALB(EmprCod, CodBota, BotLin, BotAlbRec) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBOTALB")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

