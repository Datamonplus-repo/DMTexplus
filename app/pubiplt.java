package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubiplt extends GXProcedure
{
   public pubiplt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubiplt.class ), "" );
   }

   public pubiplt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             short[] aP11 )
   {
      pubiplt.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 )
   {
      pubiplt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubiplt.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pubiplt.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pubiplt.this.AV24UbiAlbHdr = aP3[0];
      this.aP3 = aP3;
      pubiplt.this.AV15Fecha = aP4[0];
      this.aP4 = aP4;
      pubiplt.this.AV9UbiCod = aP5[0];
      this.aP5 = aP5;
      pubiplt.this.AV23UbiTip = aP6[0];
      this.aP6 = aP6;
      pubiplt.this.AV14Ok_Tint = aP7[0];
      this.aP7 = aP7;
      pubiplt.this.AV12UbiKilEnt = aP8[0];
      this.aP8 = aP8;
      pubiplt.this.AV13UbiConEnt = aP9[0];
      this.aP9 = aP9;
      pubiplt.this.AV17UbiKilUti = aP10[0];
      this.aP10 = aP10;
      pubiplt.this.AV18UbiConUti = aP11[0];
      this.aP11 = aP11;
      pubiplt.this.AV16UbiObs = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P020I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5848ParUbiLin = P020I2_A5848ParUbiLin[0] ;
         n5848ParUbiLin = P020I2_n5848ParUbiLin[0] ;
         AV8UbiLin = (short)(A5848ParUbiLin+1) ;
         AV22Ok_PT = (byte)(0) ;
         /* Using cursor P020I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod, AV9UbiCod, AV23UbiTip});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5850UbiTip = P020I3_A5850UbiTip[0] ;
            n5850UbiTip = P020I3_n5850UbiTip[0] ;
            A5838UbiCod = P020I3_A5838UbiCod[0] ;
            n5838UbiCod = P020I3_n5838UbiCod[0] ;
            A5852UbiKilEnt = P020I3_A5852UbiKilEnt[0] ;
            n5852UbiKilEnt = P020I3_n5852UbiKilEnt[0] ;
            A5853UbiConEnt = P020I3_A5853UbiConEnt[0] ;
            n5853UbiConEnt = P020I3_n5853UbiConEnt[0] ;
            A5854UbiKilUti = P020I3_A5854UbiKilUti[0] ;
            n5854UbiKilUti = P020I3_n5854UbiKilUti[0] ;
            A5855UbiConUti = P020I3_A5855UbiConUti[0] ;
            n5855UbiConUti = P020I3_n5855UbiConUti[0] ;
            A5834UbiAlbHdr = P020I3_A5834UbiAlbHdr[0] ;
            n5834UbiAlbHdr = P020I3_n5834UbiAlbHdr[0] ;
            A5851UbiFecMov = P020I3_A5851UbiFecMov[0] ;
            n5851UbiFecMov = P020I3_n5851UbiFecMov[0] ;
            A5849UbiLin = P020I3_A5849UbiLin[0] ;
            AV22Ok_PT = (byte)(1) ;
            A5852UbiKilEnt = A5852UbiKilEnt.add(AV12UbiKilEnt) ;
            n5852UbiKilEnt = false ;
            A5853UbiConEnt = (short)(A5853UbiConEnt+AV13UbiConEnt) ;
            n5853UbiConEnt = false ;
            A5854UbiKilUti = A5854UbiKilUti.add(AV17UbiKilUti) ;
            n5854UbiKilUti = false ;
            A5855UbiConUti = (short)(A5855UbiConUti+AV18UbiConUti) ;
            n5855UbiConUti = false ;
            A5834UbiAlbHdr = AV24UbiAlbHdr ;
            n5834UbiAlbHdr = false ;
            A5851UbiFecMov = AV15Fecha ;
            n5851UbiFecMov = false ;
            /* Using cursor P020I4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n5852UbiKilEnt), A5852UbiKilEnt, Boolean.valueOf(n5853UbiConEnt), Short.valueOf(A5853UbiConEnt), Boolean.valueOf(n5854UbiKilUti), A5854UbiKilUti, Boolean.valueOf(n5855UbiConUti), Short.valueOf(A5855UbiConUti), Boolean.valueOf(n5834UbiAlbHdr), Integer.valueOf(A5834UbiAlbHdr), Boolean.valueOf(n5851UbiFecMov), A5851UbiFecMov, A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Short.valueOf(A5849UbiLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIMTO");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV22Ok_PT == 0 )
         {
            if ( AV8UbiLin > 9998 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. NO SE PUEDEN GENERAR MAS LINEAS DE UBICACION PARA EL PARTIDO ACTUAL", ""));
            }
            else
            {
               /*
                  INSERT RECORD ON TABLE TXPUBIMTO

               */
               A5849UbiLin = AV8UbiLin ;
               A5838UbiCod = AV9UbiCod ;
               n5838UbiCod = false ;
               A5850UbiTip = AV23UbiTip ;
               n5850UbiTip = false ;
               A5834UbiAlbHdr = AV24UbiAlbHdr ;
               n5834UbiAlbHdr = false ;
               A5851UbiFecMov = AV15Fecha ;
               n5851UbiFecMov = false ;
               A5852UbiKilEnt = AV12UbiKilEnt ;
               n5852UbiKilEnt = false ;
               A5853UbiConEnt = AV13UbiConEnt ;
               n5853UbiConEnt = false ;
               A5854UbiKilUti = AV17UbiKilUti ;
               n5854UbiKilUti = false ;
               A5855UbiConUti = AV18UbiConUti ;
               n5855UbiConUti = false ;
               A2248ManCod = (short)(0) ;
               n2248ManCod = false ;
               A457FasCod = "" ;
               n457FasCod = false ;
               A5857UbiOkTi = AV14Ok_Tint ;
               n5857UbiOkTi = false ;
               A5856UbiObs = AV16UbiObs ;
               n5856UbiObs = false ;
               A5898UbiCie = " " ;
               n5898UbiCie = false ;
               /* Using cursor P020I5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Short.valueOf(A5849UbiLin), Boolean.valueOf(n5838UbiCod), A5838UbiCod, Boolean.valueOf(n5850UbiTip), A5850UbiTip, Boolean.valueOf(n5834UbiAlbHdr), Integer.valueOf(A5834UbiAlbHdr), Boolean.valueOf(n5851UbiFecMov), A5851UbiFecMov, Boolean.valueOf(n5852UbiKilEnt), A5852UbiKilEnt, Boolean.valueOf(n5853UbiConEnt), Short.valueOf(A5853UbiConEnt), Boolean.valueOf(n5854UbiKilUti), A5854UbiKilUti, Boolean.valueOf(n5855UbiConUti), Short.valueOf(A5855UbiConUti), Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n5856UbiObs), A5856UbiObs, Boolean.valueOf(n5857UbiOkTi), A5857UbiOkTi, Boolean.valueOf(n5898UbiCie), A5898UbiCie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIMTO");
               if ( (pr_default.getStatus(3) == 1) )
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
               A5848ParUbiLin = AV8UbiLin ;
               n5848ParUbiLin = false ;
            }
         }
         /* Using cursor P020I6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n5848ParUbiLin), Short.valueOf(A5848ParUbiLin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubiplt.this.A396EmprCod;
      this.aP1[0] = pubiplt.this.A966PartCod;
      this.aP2[0] = pubiplt.this.A252CliCod;
      this.aP3[0] = pubiplt.this.AV24UbiAlbHdr;
      this.aP4[0] = pubiplt.this.AV15Fecha;
      this.aP5[0] = pubiplt.this.AV9UbiCod;
      this.aP6[0] = pubiplt.this.AV23UbiTip;
      this.aP7[0] = pubiplt.this.AV14Ok_Tint;
      this.aP8[0] = pubiplt.this.AV12UbiKilEnt;
      this.aP9[0] = pubiplt.this.AV13UbiConEnt;
      this.aP10[0] = pubiplt.this.AV17UbiKilUti;
      this.aP11[0] = pubiplt.this.AV18UbiConUti;
      this.aP12[0] = pubiplt.this.AV16UbiObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "pubiplt");
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
      P020I2_A396EmprCod = new String[] {""} ;
      P020I2_A966PartCod = new String[] {""} ;
      P020I2_A252CliCod = new int[1] ;
      P020I2_A5848ParUbiLin = new short[1] ;
      P020I2_n5848ParUbiLin = new boolean[] {false} ;
      P020I3_A396EmprCod = new String[] {""} ;
      P020I3_A966PartCod = new String[] {""} ;
      P020I3_A252CliCod = new int[1] ;
      P020I3_A5850UbiTip = new String[] {""} ;
      P020I3_n5850UbiTip = new boolean[] {false} ;
      P020I3_A5838UbiCod = new String[] {""} ;
      P020I3_n5838UbiCod = new boolean[] {false} ;
      P020I3_A5852UbiKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020I3_n5852UbiKilEnt = new boolean[] {false} ;
      P020I3_A5853UbiConEnt = new short[1] ;
      P020I3_n5853UbiConEnt = new boolean[] {false} ;
      P020I3_A5854UbiKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020I3_n5854UbiKilUti = new boolean[] {false} ;
      P020I3_A5855UbiConUti = new short[1] ;
      P020I3_n5855UbiConUti = new boolean[] {false} ;
      P020I3_A5834UbiAlbHdr = new int[1] ;
      P020I3_n5834UbiAlbHdr = new boolean[] {false} ;
      P020I3_A5851UbiFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P020I3_n5851UbiFecMov = new boolean[] {false} ;
      P020I3_A5849UbiLin = new short[1] ;
      A5850UbiTip = "" ;
      A5838UbiCod = "" ;
      A5852UbiKilEnt = DecimalUtil.ZERO ;
      A5854UbiKilUti = DecimalUtil.ZERO ;
      A5851UbiFecMov = GXutil.nullDate() ;
      A457FasCod = "" ;
      A5857UbiOkTi = "" ;
      A5856UbiObs = "" ;
      A5898UbiCie = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubiplt__default(),
         new Object[] {
             new Object[] {
            P020I2_A396EmprCod, P020I2_A966PartCod, P020I2_A252CliCod, P020I2_A5848ParUbiLin, P020I2_n5848ParUbiLin
            }
            , new Object[] {
            P020I3_A396EmprCod, P020I3_A966PartCod, P020I3_A252CliCod, P020I3_A5850UbiTip, P020I3_n5850UbiTip, P020I3_A5838UbiCod, P020I3_n5838UbiCod, P020I3_A5852UbiKilEnt, P020I3_n5852UbiKilEnt, P020I3_A5853UbiConEnt,
            P020I3_n5853UbiConEnt, P020I3_A5854UbiKilUti, P020I3_n5854UbiKilUti, P020I3_A5855UbiConUti, P020I3_n5855UbiConUti, P020I3_A5834UbiAlbHdr, P020I3_n5834UbiAlbHdr, P020I3_A5851UbiFecMov, P020I3_n5851UbiFecMov, P020I3_A5849UbiLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Ok_PT ;
   private short AV13UbiConEnt ;
   private short AV18UbiConUti ;
   private short A5848ParUbiLin ;
   private short AV8UbiLin ;
   private short A5853UbiConEnt ;
   private short A5855UbiConUti ;
   private short A5849UbiLin ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV24UbiAlbHdr ;
   private int A5834UbiAlbHdr ;
   private int GX_INS858 ;
   private java.math.BigDecimal AV12UbiKilEnt ;
   private java.math.BigDecimal AV17UbiKilUti ;
   private java.math.BigDecimal A5852UbiKilEnt ;
   private java.math.BigDecimal A5854UbiKilUti ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV9UbiCod ;
   private String AV23UbiTip ;
   private String AV14Ok_Tint ;
   private String AV16UbiObs ;
   private String scmdbuf ;
   private String A5850UbiTip ;
   private String A5838UbiCod ;
   private String A457FasCod ;
   private String A5857UbiOkTi ;
   private String A5856UbiObs ;
   private String A5898UbiCie ;
   private String Gx_emsg ;
   private java.util.Date AV15Fecha ;
   private java.util.Date A5851UbiFecMov ;
   private boolean n5848ParUbiLin ;
   private boolean n5850UbiTip ;
   private boolean n5838UbiCod ;
   private boolean n5852UbiKilEnt ;
   private boolean n5853UbiConEnt ;
   private boolean n5854UbiKilUti ;
   private boolean n5855UbiConUti ;
   private boolean n5834UbiAlbHdr ;
   private boolean n5851UbiFecMov ;
   private boolean n2248ManCod ;
   private boolean n457FasCod ;
   private boolean n5857UbiOkTi ;
   private boolean n5856UbiObs ;
   private boolean n5898UbiCie ;
   private String[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private short[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P020I2_A396EmprCod ;
   private String[] P020I2_A966PartCod ;
   private int[] P020I2_A252CliCod ;
   private short[] P020I2_A5848ParUbiLin ;
   private boolean[] P020I2_n5848ParUbiLin ;
   private String[] P020I3_A396EmprCod ;
   private String[] P020I3_A966PartCod ;
   private int[] P020I3_A252CliCod ;
   private String[] P020I3_A5850UbiTip ;
   private boolean[] P020I3_n5850UbiTip ;
   private String[] P020I3_A5838UbiCod ;
   private boolean[] P020I3_n5838UbiCod ;
   private java.math.BigDecimal[] P020I3_A5852UbiKilEnt ;
   private boolean[] P020I3_n5852UbiKilEnt ;
   private short[] P020I3_A5853UbiConEnt ;
   private boolean[] P020I3_n5853UbiConEnt ;
   private java.math.BigDecimal[] P020I3_A5854UbiKilUti ;
   private boolean[] P020I3_n5854UbiKilUti ;
   private short[] P020I3_A5855UbiConUti ;
   private boolean[] P020I3_n5855UbiConUti ;
   private int[] P020I3_A5834UbiAlbHdr ;
   private boolean[] P020I3_n5834UbiAlbHdr ;
   private java.util.Date[] P020I3_A5851UbiFecMov ;
   private boolean[] P020I3_n5851UbiFecMov ;
   private short[] P020I3_A5849UbiLin ;
}

final  class pubiplt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020I2", "SELECT EmprCod, PartCod, CliCod, ParUbiLin FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P020I3", "SELECT EmprCod, PartCod, CliCod, UbiTip, UbiCod, UbiKilEnt, UbiConEnt, UbiKilUti, UbiConUti, UbiAlbHdr, UbiFecMov, UbiLin FROM TXPUBIMTO WHERE (EmprCod = ? and CliCod = ? and PartCod = ? and UbiCod = ?) AND (UbiTip = ?) ORDER BY EmprCod, CliCod, PartCod, UbiCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020I4", "UPDATE TXPUBIMTO SET UbiKilEnt=?, UbiConEnt=?, UbiKilUti=?, UbiConUti=?, UbiAlbHdr=?, UbiFecMov=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND UbiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIMTO")
         ,new UpdateCursor("P020I5", "INSERT INTO TXPUBIMTO(EmprCod, PartCod, CliCod, UbiLin, UbiCod, UbiTip, UbiAlbHdr, UbiFecMov, UbiKilEnt, UbiConEnt, UbiKilUti, UbiConUti, ManCod, FasCod, UbiObs, UbiOkTi, UbiCie, UbiPre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIMTO")
         ,new UpdateCursor("P020I6", "UPDATE TXPCPARTI SET ParUbiLin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 2);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 16);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setShort(10, ((Number) parms[15]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

