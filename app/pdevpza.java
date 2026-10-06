package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdevpza extends GXProcedure
{
   public pdevpza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdevpza.class ), "" );
   }

   public pdevpza( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          String[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          short[] aP8 ,
                          java.math.BigDecimal[] aP9 )
   {
      pdevpza.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 )
   {
      pdevpza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdevpza.this.A323DevGenCod = aP1[0];
      this.aP1 = aP1;
      pdevpza.this.AV10AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdevpza.this.AV21AlbRecPie = aP3[0];
      this.aP3 = aP3;
      pdevpza.this.AV11Kilos = aP4[0];
      this.aP4 = aP4;
      pdevpza.this.AV12Metros = aP5[0];
      this.aP5 = aP5;
      pdevpza.this.AV20AlbRUni = aP6[0];
      this.aP6 = aP6;
      pdevpza.this.AV22DevGenUni = aP7[0];
      this.aP7 = aP7;
      pdevpza.this.AV23DevGenPie = aP8[0];
      this.aP8 = aP8;
      pdevpza.this.AV24AlbRUniUti = aP9[0];
      this.aP9 = aP9;
      pdevpza.this.AV25AlbRPieUti = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01MP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A326DevGenPie = P01MP2_A326DevGenPie[0] ;
         n326DevGenPie = P01MP2_n326DevGenPie[0] ;
         A328DevGenUni = P01MP2_A328DevGenUni[0] ;
         n328DevGenUni = P01MP2_n328DevGenUni[0] ;
         /*
            INSERT RECORD ON TABLE TXPDevPie

         */
         A2159AlbRecPie = AV21AlbRecPie ;
         if ( GXutil.strcmp(AV20AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A3067DevPieUni = AV12Metros ;
         }
         else
         {
            A3067DevPieUni = AV11Kilos ;
         }
         /* Using cursor P01MP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie, A3067DevPieUni});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
         if ( (pr_default.getStatus(1) == 1) )
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
         A326DevGenPie = (short)(A326DevGenPie+1) ;
         n326DevGenPie = false ;
         if ( GXutil.strcmp(AV20AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A328DevGenUni = A328DevGenUni.add(AV12Metros) ;
            n328DevGenUni = false ;
         }
         else
         {
            A328DevGenUni = A328DevGenUni.add(AV11Kilos) ;
            n328DevGenUni = false ;
         }
         AV23DevGenPie = A326DevGenPie ;
         AV22DevGenUni = A328DevGenUni ;
         /* Using cursor P01MP4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n328DevGenUni), A328DevGenUni, A396EmprCod, Integer.valueOf(A323DevGenCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01MP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10AlbRecCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A44AlbRecCod = P01MP5_A44AlbRecCod[0] ;
         A60AlbRUniUti = P01MP5_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P01MP5_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P01MP5_A58AlbRUniEnt[0] ;
         A47AlbREst = P01MP5_A47AlbREst[0] ;
         if ( GXutil.strcmp(AV20AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A60AlbRUniUti = A60AlbRUniUti.add(AV11Kilos) ;
         }
         if ( GXutil.strcmp(AV20AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A60AlbRUniUti = A60AlbRUniUti.add(AV12Metros) ;
         }
         A54AlbRPieUti = (int)(A54AlbRPieUti+1) ;
         if ( A58AlbRUniEnt.subtract(A60AlbRUniUti).doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
         }
         if ( A58AlbRUniEnt.subtract(A60AlbRUniUti).doubleValue() > 0 )
         {
            A47AlbREst = (byte)(0) ;
         }
         AV24AlbRUniUti = A60AlbRUniUti ;
         AV25AlbRPieUti = A54AlbRPieUti ;
         /* Using cursor P01MP6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), AV21AlbRecPie});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2159AlbRecPie = P01MP6_A2159AlbRecPie[0] ;
            A2156AlbRecKgmU = P01MP6_A2156AlbRecKgmU[0] ;
            A2158AlbRecMtrU = P01MP6_A2158AlbRecMtrU[0] ;
            if ( GXutil.strcmp(AV20AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2156AlbRecKgmU = A2156AlbRecKgmU.add(AV11Kilos) ;
               A2158AlbRecMtrU = A2158AlbRecMtrU.add(AV12Metros) ;
            }
            else
            {
               A2158AlbRecMtrU = A2158AlbRecMtrU.add(AV12Metros) ;
               A2156AlbRecKgmU = A2156AlbRecKgmU.add(AV11Kilos) ;
            }
            /* Using cursor P01MP7 */
            pr_default.execute(5, new Object[] {A2156AlbRecKgmU, A2158AlbRecMtrU, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Using cursor P01MP8 */
         pr_default.execute(6, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdevpza.this.A396EmprCod;
      this.aP1[0] = pdevpza.this.A323DevGenCod;
      this.aP2[0] = pdevpza.this.AV10AlbRecCod;
      this.aP3[0] = pdevpza.this.AV21AlbRecPie;
      this.aP4[0] = pdevpza.this.AV11Kilos;
      this.aP5[0] = pdevpza.this.AV12Metros;
      this.aP6[0] = pdevpza.this.AV20AlbRUni;
      this.aP7[0] = pdevpza.this.AV22DevGenUni;
      this.aP8[0] = pdevpza.this.AV23DevGenPie;
      this.aP9[0] = pdevpza.this.AV24AlbRUniUti;
      this.aP10[0] = pdevpza.this.AV25AlbRPieUti;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdevpza");
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
      P01MP2_A396EmprCod = new String[] {""} ;
      P01MP2_A323DevGenCod = new int[1] ;
      P01MP2_A326DevGenPie = new short[1] ;
      P01MP2_n326DevGenPie = new boolean[] {false} ;
      P01MP2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MP2_n328DevGenUni = new boolean[] {false} ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      A3067DevPieUni = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P01MP5_A396EmprCod = new String[] {""} ;
      P01MP5_A44AlbRecCod = new int[1] ;
      P01MP5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MP5_A54AlbRPieUti = new int[1] ;
      P01MP5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MP5_A47AlbREst = new byte[1] ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      P01MP6_A396EmprCod = new String[] {""} ;
      P01MP6_A44AlbRecCod = new int[1] ;
      P01MP6_A2159AlbRecPie = new String[] {""} ;
      P01MP6_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MP6_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdevpza__default(),
         new Object[] {
             new Object[] {
            P01MP2_A396EmprCod, P01MP2_A323DevGenCod, P01MP2_A326DevGenPie, P01MP2_n326DevGenPie, P01MP2_A328DevGenUni, P01MP2_n328DevGenUni
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01MP5_A396EmprCod, P01MP5_A44AlbRecCod, P01MP5_A60AlbRUniUti, P01MP5_A54AlbRPieUti, P01MP5_A58AlbRUniEnt, P01MP5_A47AlbREst
            }
            , new Object[] {
            P01MP6_A396EmprCod, P01MP6_A44AlbRecCod, P01MP6_A2159AlbRecPie, P01MP6_A2156AlbRecKgmU, P01MP6_A2158AlbRecMtrU
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

   private byte A47AlbREst ;
   private short AV23DevGenPie ;
   private short A326DevGenPie ;
   private short Gx_err ;
   private int A323DevGenCod ;
   private int AV10AlbRecCod ;
   private int AV25AlbRPieUti ;
   private int GX_INS451 ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal AV11Kilos ;
   private java.math.BigDecimal AV12Metros ;
   private java.math.BigDecimal AV22DevGenUni ;
   private java.math.BigDecimal AV24AlbRUniUti ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal A3067DevPieUni ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String A396EmprCod ;
   private String AV21AlbRecPie ;
   private String AV20AlbRUni ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String Gx_emsg ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private int[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MP2_A396EmprCod ;
   private int[] P01MP2_A323DevGenCod ;
   private short[] P01MP2_A326DevGenPie ;
   private boolean[] P01MP2_n326DevGenPie ;
   private java.math.BigDecimal[] P01MP2_A328DevGenUni ;
   private boolean[] P01MP2_n328DevGenUni ;
   private String[] P01MP5_A396EmprCod ;
   private int[] P01MP5_A44AlbRecCod ;
   private java.math.BigDecimal[] P01MP5_A60AlbRUniUti ;
   private int[] P01MP5_A54AlbRPieUti ;
   private java.math.BigDecimal[] P01MP5_A58AlbRUniEnt ;
   private byte[] P01MP5_A47AlbREst ;
   private String[] P01MP6_A396EmprCod ;
   private int[] P01MP6_A44AlbRecCod ;
   private String[] P01MP6_A2159AlbRecPie ;
   private java.math.BigDecimal[] P01MP6_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P01MP6_A2158AlbRecMtrU ;
}

final  class pdevpza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MP2", "SELECT EmprCod, DevGenCod, DevGenPie, DevGenUni FROM TXPDEVGEN WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01MP3", "INSERT INTO TXPDevPie(EmprCod, DevGenCod, AlbRecPie, DevPieUni) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDevPie")
         ,new UpdateCursor("P01MP4", "UPDATE TXPDEVGEN SET DevGenPie=?, DevGenUni=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
         ,new ForEachCursor("P01MP5", "SELECT EmprCod, AlbRecCod, AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01MP6", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecKgmU, AlbRecMtrU FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01MP7", "UPDATE TXPALBDET SET AlbRecKgmU=?, AlbRecMtrU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P01MP8", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

