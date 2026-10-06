package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregcor2 extends GXProcedure
{
   public pregcor2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregcor2.class ), "" );
   }

   public pregcor2( int remoteHandle ,
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
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             short[] aP18 ,
                             short[] aP19 )
   {
      pregcor2.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        short[] aP18 ,
                        short[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             short[] aP18 ,
                             short[] aP19 ,
                             String[] aP20 )
   {
      pregcor2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pregcor2.this.AV9Lb_rcnens = aP1[0];
      this.aP1 = aP1;
      pregcor2.this.AV10Lb_rcncar = aP2[0];
      this.aP2 = aP2;
      pregcor2.this.AV11Lb_rccorc = aP3[0];
      this.aP3 = aP3;
      pregcor2.this.AV12Lb_rcncorc = aP4[0];
      this.aP4 = aP4;
      pregcor2.this.AV13Lb_rccor = aP5[0];
      this.aP5 = aP5;
      pregcor2.this.AV14Lb_rcncor = aP6[0];
      this.aP6 = aP6;
      pregcor2.this.AV15Lb_rctc = aP7[0];
      this.aP7 = aP7;
      pregcor2.this.AV16Lb_rcp1 = aP8[0];
      this.aP8 = aP8;
      pregcor2.this.AV17Lb_rcp2 = aP9[0];
      this.aP9 = aP9;
      pregcor2.this.AV18Lb_rcp3 = aP10[0];
      this.aP10 = aP10;
      pregcor2.this.AV19Lb_rcp4 = aP11[0];
      this.aP11 = aP11;
      pregcor2.this.AV20Lb_rcp5 = aP12[0];
      this.aP12 = aP12;
      pregcor2.this.AV21Lb_rcp6 = aP13[0];
      this.aP13 = aP13;
      pregcor2.this.AV22Lb_rcpo1 = aP14[0];
      this.aP14 = aP14;
      pregcor2.this.AV23Lb_rcpo2 = aP15[0];
      this.aP15 = aP15;
      pregcor2.this.AV24Lb_rcpo3 = aP16[0];
      this.aP16 = aP16;
      pregcor2.this.AV25Lb_rcpo4 = aP17[0];
      this.aP17 = aP17;
      pregcor2.this.AV26Lb_rcpo5 = aP18[0];
      this.aP18 = aP18;
      pregcor2.this.AV27Lb_rcpo6 = aP19[0];
      this.aP19 = aP19;
      pregcor2.this.AV8Ex_ensayo = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ex_ensayo = httpContext.getMessage( "N", "") ;
      AV13Lb_rccor = " " ;
      AV14Lb_rcncor = 0 ;
      AV15Lb_rctc = (byte)(0) ;
      AV11Lb_rccorc = " " ;
      AV12Lb_rcncorc = 0 ;
      AV10Lb_rcncar = " " ;
      AV16Lb_rcp1 = " " ;
      AV17Lb_rcp2 = " " ;
      AV18Lb_rcp3 = " " ;
      AV19Lb_rcp4 = " " ;
      AV20Lb_rcp5 = " " ;
      AV21Lb_rcp6 = " " ;
      AV22Lb_rcpo1 = (short)(0) ;
      AV23Lb_rcpo2 = (short)(0) ;
      AV24Lb_rcpo3 = (short)(0) ;
      AV25Lb_rcpo4 = (short)(0) ;
      AV26Lb_rcpo5 = (short)(0) ;
      AV27Lb_rcpo6 = (short)(0) ;
      /* Using cursor P02PH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_rcnens)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P02PH2_A5532Lb_numero[0] ;
         A5536Lb_ColNom = P02PH2_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P02PH2_A5537Lb_ColNum[0] ;
         A831TipColCod = P02PH2_A831TipColCod[0] ;
         n831TipColCod = P02PH2_n831TipColCod[0] ;
         A5538Lb_ColNomC = P02PH2_A5538Lb_ColNomC[0] ;
         A5539Lb_ColNumC = P02PH2_A5539Lb_ColNumC[0] ;
         A5540Lb_Cartaz = P02PH2_A5540Lb_Cartaz[0] ;
         A6653Lb_Tra1 = P02PH2_A6653Lb_Tra1[0] ;
         A6655Lb_Tra2 = P02PH2_A6655Lb_Tra2[0] ;
         A6657Lb_Tra3 = P02PH2_A6657Lb_Tra3[0] ;
         A6842Lb_Tra4 = P02PH2_A6842Lb_Tra4[0] ;
         A6844Lb_Tra5 = P02PH2_A6844Lb_Tra5[0] ;
         A6846Lb_Tra6 = P02PH2_A6846Lb_Tra6[0] ;
         A6654Lb_TraP1 = P02PH2_A6654Lb_TraP1[0] ;
         A6656Lb_TraP2 = P02PH2_A6656Lb_TraP2[0] ;
         A6658Lb_TraP3 = P02PH2_A6658Lb_TraP3[0] ;
         A6843Lb_TraP4 = P02PH2_A6843Lb_TraP4[0] ;
         A6845Lb_TraP5 = P02PH2_A6845Lb_TraP5[0] ;
         A6847Lb_TraP6 = P02PH2_A6847Lb_TraP6[0] ;
         AV13Lb_rccor = A5536Lb_ColNom ;
         AV14Lb_rcncor = A5537Lb_ColNum ;
         AV15Lb_rctc = A831TipColCod ;
         AV11Lb_rccorc = A5538Lb_ColNomC ;
         AV12Lb_rcncorc = A5539Lb_ColNumC ;
         AV10Lb_rcncar = A5540Lb_Cartaz ;
         AV16Lb_rcp1 = A6653Lb_Tra1 ;
         AV17Lb_rcp2 = A6655Lb_Tra2 ;
         AV18Lb_rcp3 = A6657Lb_Tra3 ;
         AV19Lb_rcp4 = A6842Lb_Tra4 ;
         AV20Lb_rcp5 = A6844Lb_Tra5 ;
         AV21Lb_rcp6 = A6846Lb_Tra6 ;
         AV22Lb_rcpo1 = A6654Lb_TraP1 ;
         AV23Lb_rcpo2 = A6656Lb_TraP2 ;
         AV24Lb_rcpo3 = A6658Lb_TraP3 ;
         AV25Lb_rcpo4 = A6843Lb_TraP4 ;
         AV26Lb_rcpo5 = A6845Lb_TraP5 ;
         AV27Lb_rcpo6 = A6847Lb_TraP6 ;
         AV8Ex_ensayo = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pregcor2.this.A396EmprCod;
      this.aP1[0] = pregcor2.this.AV9Lb_rcnens;
      this.aP2[0] = pregcor2.this.AV10Lb_rcncar;
      this.aP3[0] = pregcor2.this.AV11Lb_rccorc;
      this.aP4[0] = pregcor2.this.AV12Lb_rcncorc;
      this.aP5[0] = pregcor2.this.AV13Lb_rccor;
      this.aP6[0] = pregcor2.this.AV14Lb_rcncor;
      this.aP7[0] = pregcor2.this.AV15Lb_rctc;
      this.aP8[0] = pregcor2.this.AV16Lb_rcp1;
      this.aP9[0] = pregcor2.this.AV17Lb_rcp2;
      this.aP10[0] = pregcor2.this.AV18Lb_rcp3;
      this.aP11[0] = pregcor2.this.AV19Lb_rcp4;
      this.aP12[0] = pregcor2.this.AV20Lb_rcp5;
      this.aP13[0] = pregcor2.this.AV21Lb_rcp6;
      this.aP14[0] = pregcor2.this.AV22Lb_rcpo1;
      this.aP15[0] = pregcor2.this.AV23Lb_rcpo2;
      this.aP16[0] = pregcor2.this.AV24Lb_rcpo3;
      this.aP17[0] = pregcor2.this.AV25Lb_rcpo4;
      this.aP18[0] = pregcor2.this.AV26Lb_rcpo5;
      this.aP19[0] = pregcor2.this.AV27Lb_rcpo6;
      this.aP20[0] = pregcor2.this.AV8Ex_ensayo;
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
      P02PH2_A396EmprCod = new String[] {""} ;
      P02PH2_A5532Lb_numero = new int[1] ;
      P02PH2_A5536Lb_ColNom = new String[] {""} ;
      P02PH2_A5537Lb_ColNum = new int[1] ;
      P02PH2_A831TipColCod = new byte[1] ;
      P02PH2_n831TipColCod = new boolean[] {false} ;
      P02PH2_A5538Lb_ColNomC = new String[] {""} ;
      P02PH2_A5539Lb_ColNumC = new int[1] ;
      P02PH2_A5540Lb_Cartaz = new String[] {""} ;
      P02PH2_A6653Lb_Tra1 = new String[] {""} ;
      P02PH2_A6655Lb_Tra2 = new String[] {""} ;
      P02PH2_A6657Lb_Tra3 = new String[] {""} ;
      P02PH2_A6842Lb_Tra4 = new String[] {""} ;
      P02PH2_A6844Lb_Tra5 = new String[] {""} ;
      P02PH2_A6846Lb_Tra6 = new String[] {""} ;
      P02PH2_A6654Lb_TraP1 = new short[1] ;
      P02PH2_A6656Lb_TraP2 = new short[1] ;
      P02PH2_A6658Lb_TraP3 = new short[1] ;
      P02PH2_A6843Lb_TraP4 = new short[1] ;
      P02PH2_A6845Lb_TraP5 = new short[1] ;
      P02PH2_A6847Lb_TraP6 = new short[1] ;
      A5536Lb_ColNom = "" ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A6842Lb_Tra4 = "" ;
      A6844Lb_Tra5 = "" ;
      A6846Lb_Tra6 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pregcor2__default(),
         new Object[] {
             new Object[] {
            P02PH2_A396EmprCod, P02PH2_A5532Lb_numero, P02PH2_A5536Lb_ColNom, P02PH2_A5537Lb_ColNum, P02PH2_A831TipColCod, P02PH2_n831TipColCod, P02PH2_A5538Lb_ColNomC, P02PH2_A5539Lb_ColNumC, P02PH2_A5540Lb_Cartaz, P02PH2_A6653Lb_Tra1,
            P02PH2_A6655Lb_Tra2, P02PH2_A6657Lb_Tra3, P02PH2_A6842Lb_Tra4, P02PH2_A6844Lb_Tra5, P02PH2_A6846Lb_Tra6, P02PH2_A6654Lb_TraP1, P02PH2_A6656Lb_TraP2, P02PH2_A6658Lb_TraP3, P02PH2_A6843Lb_TraP4, P02PH2_A6845Lb_TraP5,
            P02PH2_A6847Lb_TraP6
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Lb_rctc ;
   private byte A831TipColCod ;
   private short AV22Lb_rcpo1 ;
   private short AV23Lb_rcpo2 ;
   private short AV24Lb_rcpo3 ;
   private short AV25Lb_rcpo4 ;
   private short AV26Lb_rcpo5 ;
   private short AV27Lb_rcpo6 ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A6843Lb_TraP4 ;
   private short A6845Lb_TraP5 ;
   private short A6847Lb_TraP6 ;
   private short Gx_err ;
   private int AV9Lb_rcnens ;
   private int AV12Lb_rcncorc ;
   private int AV14Lb_rcncor ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A5539Lb_ColNumC ;
   private String A396EmprCod ;
   private String AV10Lb_rcncar ;
   private String AV11Lb_rccorc ;
   private String AV13Lb_rccor ;
   private String AV16Lb_rcp1 ;
   private String AV17Lb_rcp2 ;
   private String AV18Lb_rcp3 ;
   private String AV19Lb_rcp4 ;
   private String AV20Lb_rcp5 ;
   private String AV21Lb_rcp6 ;
   private String AV8Ex_ensayo ;
   private String scmdbuf ;
   private String A5536Lb_ColNom ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A6842Lb_Tra4 ;
   private String A6844Lb_Tra5 ;
   private String A6846Lb_Tra6 ;
   private boolean n831TipColCod ;
   private String[] aP20 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private short[] aP16 ;
   private short[] aP17 ;
   private short[] aP18 ;
   private short[] aP19 ;
   private IDataStoreProvider pr_default ;
   private String[] P02PH2_A396EmprCod ;
   private int[] P02PH2_A5532Lb_numero ;
   private String[] P02PH2_A5536Lb_ColNom ;
   private int[] P02PH2_A5537Lb_ColNum ;
   private byte[] P02PH2_A831TipColCod ;
   private boolean[] P02PH2_n831TipColCod ;
   private String[] P02PH2_A5538Lb_ColNomC ;
   private int[] P02PH2_A5539Lb_ColNumC ;
   private String[] P02PH2_A5540Lb_Cartaz ;
   private String[] P02PH2_A6653Lb_Tra1 ;
   private String[] P02PH2_A6655Lb_Tra2 ;
   private String[] P02PH2_A6657Lb_Tra3 ;
   private String[] P02PH2_A6842Lb_Tra4 ;
   private String[] P02PH2_A6844Lb_Tra5 ;
   private String[] P02PH2_A6846Lb_Tra6 ;
   private short[] P02PH2_A6654Lb_TraP1 ;
   private short[] P02PH2_A6656Lb_TraP2 ;
   private short[] P02PH2_A6658Lb_TraP3 ;
   private short[] P02PH2_A6843Lb_TraP4 ;
   private short[] P02PH2_A6845Lb_TraP5 ;
   private short[] P02PH2_A6847Lb_TraP6 ;
}

final  class pregcor2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PH2", "SELECT EmprCod, Lb_numero, Lb_ColNom, Lb_ColNum, TipColCod, Lb_ColNomC, Lb_ColNumC, Lb_Cartaz, Lb_Tra1, Lb_Tra2, Lb_Tra3, Lb_Tra4, Lb_Tra5, Lb_Tra6, Lb_TraP1, Lb_TraP2, Lb_TraP3, Lb_TraP4, Lb_TraP5, Lb_TraP6 FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((String[]) buf[13])[0] = rslt.getString(13, 4);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
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

