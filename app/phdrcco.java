package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrcco extends GXProcedure
{
   public phdrcco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrcco.class ), "" );
   }

   public phdrcco( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             int[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 )
   {
      phdrcco.this.aP22 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        int[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 ,
                        String[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             int[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             String[] aP22 )
   {
      phdrcco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrcco.this.AV33BarCod = aP1[0];
      this.aP1 = aP1;
      phdrcco.this.AV35BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrcco.this.AV34BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrcco.this.AV23BarSer = aP4[0];
      this.aP4 = aP4;
      phdrcco.this.AV24BarSerDsc = aP5[0];
      this.aP5 = aP5;
      phdrcco.this.AV25BarColNom = aP6[0];
      this.aP6 = aP6;
      phdrcco.this.AV26BarColNum = aP7[0];
      this.aP7 = aP7;
      phdrcco.this.AV27BarTipCol = aP8[0];
      this.aP8 = aP8;
      phdrcco.this.AV28BarTipdis = aP9[0];
      this.aP9 = aP9;
      phdrcco.this.AV9BarMdlcod = aP10[0];
      this.aP10 = aP10;
      phdrcco.this.AV10BarTam = aP11[0];
      this.aP11 = aP11;
      phdrcco.this.AV12Bartipart = aP12[0];
      this.aP12 = aP12;
      phdrcco.this.AV13Baracc = aP13[0];
      this.aP13 = aP13;
      phdrcco.this.AV14BarAntp = aP14[0];
      this.aP14 = aP14;
      phdrcco.this.AV15BarAntpT = aP15[0];
      this.aP15 = aP15;
      phdrcco.this.AV16BarDisnum = aP16[0];
      this.aP16 = aP16;
      phdrcco.this.AV18BarMat = aP17[0];
      this.aP17 = aP17;
      phdrcco.this.AV19BarLar = aP18[0];
      this.aP18 = aP18;
      phdrcco.this.AV8Discod = aP19[0];
      this.aP19 = aP19;
      phdrcco.this.AV31Usurcod = aP20[0];
      this.aP20 = aP20;
      phdrcco.this.AV32Station = aP21[0];
      this.aP21 = aP21;
      phdrcco.this.AV36Pgmnamei = aP22[0];
      this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02B42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02B42_A361DisCod[0] ;
         A339DisArtLar = P02B42_A339DisArtLar[0] ;
         A340DisArtMat = P02B42_A340DisArtMat[0] ;
         A360DisCliNum = P02B42_A360DisCliNum[0] ;
         A5405DisAntpT = P02B42_A5405DisAntpT[0] ;
         A5366DisAntp = P02B42_A5366DisAntp[0] ;
         A5252DisAcc = P02B42_A5252DisAcc[0] ;
         A352DisArtTip = P02B42_A352DisArtTip[0] ;
         A4615DisTam = P02B42_A4615DisTam[0] ;
         A4614DisMdlCod = P02B42_A4614DisMdlCod[0] ;
         A2009DisTipDis = P02B42_A2009DisTipDis[0] ;
         n2009DisTipDis = P02B42_n2009DisTipDis[0] ;
         A390DisTipCol = P02B42_A390DisTipCol[0] ;
         n390DisTipCol = P02B42_n390DisTipCol[0] ;
         A363DisColNum = P02B42_A363DisColNum[0] ;
         n363DisColNum = P02B42_n363DisColNum[0] ;
         A362DisColNom = P02B42_A362DisColNom[0] ;
         n362DisColNom = P02B42_n362DisColNom[0] ;
         A337DisArtDsc = P02B42_A337DisArtDsc[0] ;
         A335DisArtCod = P02B42_A335DisArtCod[0] ;
         A4720DisDishCod = P02B42_A4720DisDishCod[0] ;
         AV30Texto_i = httpContext.getMessage( "Discod=", "") + GXutil.str( AV8Discod, 8, 0) + httpContext.getMessage( " Datos Iniciales:", "") + GXutil.newLine( ) + A335DisArtCod + "/" + A337DisArtDsc + "/" + A362DisColNom + "/" + GXutil.str( A363DisColNum, 6, 0) + "/" + GXutil.str( A390DisTipCol, 2, 0) + "/" + GXutil.newLine( ) + A2009DisTipDis + "/" + A4614DisMdlCod + "/" + A4615DisTam + "/" + GXutil.str( A352DisArtTip, 4, 0) + "/" + A5252DisAcc + "/" + GXutil.newLine( ) + A5366DisAntp + "/" + A5405DisAntpT + "/" + A360DisCliNum + "/" + A340DisArtMat + "/" + A339DisArtLar + "/" + GXutil.newLine( ) + httpContext.getMessage( "Discod=", "") + GXutil.str( AV8Discod, 8, 0) + httpContext.getMessage( " Datos Finales:", "") + GXutil.newLine( ) + AV23BarSer + "/" + AV24BarSerDsc + "/" + AV25BarColNom + "/" + GXutil.str( AV26BarColNum, 6, 0) + "/" + GXutil.str( AV27BarTipCol, 2, 0) + "/" + GXutil.newLine( ) + AV28BarTipdis + "/" + AV9BarMdlcod + "/" + AV10BarTam + "/" + GXutil.str( AV12Bartipart, 4, 0) + "/" + AV13Baracc + "/" + GXutil.newLine( ) + AV14BarAntp + "/" + AV15BarAntpT + "/" + AV16BarDisnum + "/" + AV18BarMat + "/" + AV19BarLar + GXutil.newLine( ) ;
         A335DisArtCod = AV23BarSer ;
         A337DisArtDsc = AV24BarSerDsc ;
         A362DisColNom = AV25BarColNom ;
         n362DisColNom = false ;
         A363DisColNum = AV26BarColNum ;
         n363DisColNum = false ;
         A390DisTipCol = AV27BarTipCol ;
         n390DisTipCol = false ;
         A2009DisTipDis = AV28BarTipdis ;
         n2009DisTipDis = false ;
         A4615DisTam = AV10BarTam ;
         A352DisArtTip = AV12Bartipart ;
         A5252DisAcc = AV13Baracc ;
         A5366DisAntp = AV14BarAntp ;
         A5405DisAntpT = AV15BarAntpT ;
         A360DisCliNum = AV16BarDisnum ;
         A4720DisDishCod = AV11Bardishcod ;
         A340DisArtMat = AV18BarMat ;
         A339DisArtLar = AV19BarLar ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmnamei, AV31Usurcod, AV32Station, AV30Texto_i, AV33BarCod, AV35BarCodReo, AV34BarCodPar) ;
         /* Using cursor P02B43 */
         pr_default.execute(1, new Object[] {A339DisArtLar, A340DisArtMat, A360DisCliNum, A5405DisAntpT, A5366DisAntp, A5252DisAcc, Short.valueOf(A352DisArtTip), A4615DisTam, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n362DisColNom), A362DisColNom, A337DisArtDsc, A335DisArtCod, A4720DisDishCod, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrcco.this.A396EmprCod;
      this.aP1[0] = phdrcco.this.AV33BarCod;
      this.aP2[0] = phdrcco.this.AV35BarCodReo;
      this.aP3[0] = phdrcco.this.AV34BarCodPar;
      this.aP4[0] = phdrcco.this.AV23BarSer;
      this.aP5[0] = phdrcco.this.AV24BarSerDsc;
      this.aP6[0] = phdrcco.this.AV25BarColNom;
      this.aP7[0] = phdrcco.this.AV26BarColNum;
      this.aP8[0] = phdrcco.this.AV27BarTipCol;
      this.aP9[0] = phdrcco.this.AV28BarTipdis;
      this.aP10[0] = phdrcco.this.AV9BarMdlcod;
      this.aP11[0] = phdrcco.this.AV10BarTam;
      this.aP12[0] = phdrcco.this.AV12Bartipart;
      this.aP13[0] = phdrcco.this.AV13Baracc;
      this.aP14[0] = phdrcco.this.AV14BarAntp;
      this.aP15[0] = phdrcco.this.AV15BarAntpT;
      this.aP16[0] = phdrcco.this.AV16BarDisnum;
      this.aP17[0] = phdrcco.this.AV18BarMat;
      this.aP18[0] = phdrcco.this.AV19BarLar;
      this.aP19[0] = phdrcco.this.AV8Discod;
      this.aP20[0] = phdrcco.this.AV31Usurcod;
      this.aP21[0] = phdrcco.this.AV32Station;
      this.aP22[0] = phdrcco.this.AV36Pgmnamei;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrcco");
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
      P02B42_A396EmprCod = new String[] {""} ;
      P02B42_A361DisCod = new int[1] ;
      P02B42_A339DisArtLar = new String[] {""} ;
      P02B42_A340DisArtMat = new String[] {""} ;
      P02B42_A360DisCliNum = new String[] {""} ;
      P02B42_A5405DisAntpT = new String[] {""} ;
      P02B42_A5366DisAntp = new String[] {""} ;
      P02B42_A5252DisAcc = new String[] {""} ;
      P02B42_A352DisArtTip = new short[1] ;
      P02B42_A4615DisTam = new String[] {""} ;
      P02B42_A4614DisMdlCod = new String[] {""} ;
      P02B42_A2009DisTipDis = new String[] {""} ;
      P02B42_n2009DisTipDis = new boolean[] {false} ;
      P02B42_A390DisTipCol = new byte[1] ;
      P02B42_n390DisTipCol = new boolean[] {false} ;
      P02B42_A363DisColNum = new int[1] ;
      P02B42_n363DisColNum = new boolean[] {false} ;
      P02B42_A362DisColNom = new String[] {""} ;
      P02B42_n362DisColNom = new boolean[] {false} ;
      P02B42_A337DisArtDsc = new String[] {""} ;
      P02B42_A335DisArtCod = new String[] {""} ;
      P02B42_A4720DisDishCod = new String[] {""} ;
      A339DisArtLar = "" ;
      A340DisArtMat = "" ;
      A360DisCliNum = "" ;
      A5405DisAntpT = "" ;
      A5366DisAntp = "" ;
      A5252DisAcc = "" ;
      A4615DisTam = "" ;
      A4614DisMdlCod = "" ;
      A2009DisTipDis = "" ;
      A362DisColNom = "" ;
      A337DisArtDsc = "" ;
      A335DisArtCod = "" ;
      A4720DisDishCod = "" ;
      AV30Texto_i = "" ;
      AV11Bardishcod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrcco__default(),
         new Object[] {
             new Object[] {
            P02B42_A396EmprCod, P02B42_A361DisCod, P02B42_A339DisArtLar, P02B42_A340DisArtMat, P02B42_A360DisCliNum, P02B42_A5405DisAntpT, P02B42_A5366DisAntp, P02B42_A5252DisAcc, P02B42_A352DisArtTip, P02B42_A4615DisTam,
            P02B42_A4614DisMdlCod, P02B42_A2009DisTipDis, P02B42_n2009DisTipDis, P02B42_A390DisTipCol, P02B42_n390DisTipCol, P02B42_A363DisColNum, P02B42_n363DisColNum, P02B42_A362DisColNom, P02B42_n362DisColNom, P02B42_A337DisArtDsc,
            P02B42_A335DisArtCod, P02B42_A4720DisDishCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35BarCodReo ;
   private byte AV27BarTipCol ;
   private byte A390DisTipCol ;
   private short AV12Bartipart ;
   private short A352DisArtTip ;
   private short Gx_err ;
   private int AV33BarCod ;
   private int AV26BarColNum ;
   private int AV8Discod ;
   private int A361DisCod ;
   private int A363DisColNum ;
   private String A396EmprCod ;
   private String AV34BarCodPar ;
   private String AV23BarSer ;
   private String AV24BarSerDsc ;
   private String AV25BarColNom ;
   private String AV28BarTipdis ;
   private String AV9BarMdlcod ;
   private String AV10BarTam ;
   private String AV13Baracc ;
   private String AV14BarAntp ;
   private String AV15BarAntpT ;
   private String AV16BarDisnum ;
   private String AV18BarMat ;
   private String AV19BarLar ;
   private String AV31Usurcod ;
   private String AV32Station ;
   private String AV36Pgmnamei ;
   private String scmdbuf ;
   private String A339DisArtLar ;
   private String A340DisArtMat ;
   private String A360DisCliNum ;
   private String A5405DisAntpT ;
   private String A5366DisAntp ;
   private String A5252DisAcc ;
   private String A4615DisTam ;
   private String A4614DisMdlCod ;
   private String A2009DisTipDis ;
   private String A362DisColNom ;
   private String A337DisArtDsc ;
   private String A335DisArtCod ;
   private String A4720DisDishCod ;
   private String AV11Bardishcod ;
   private boolean n2009DisTipDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private String AV30Texto_i ;
   private String[] aP22 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private int[] aP19 ;
   private String[] aP20 ;
   private String[] aP21 ;
   private IDataStoreProvider pr_default ;
   private String[] P02B42_A396EmprCod ;
   private int[] P02B42_A361DisCod ;
   private String[] P02B42_A339DisArtLar ;
   private String[] P02B42_A340DisArtMat ;
   private String[] P02B42_A360DisCliNum ;
   private String[] P02B42_A5405DisAntpT ;
   private String[] P02B42_A5366DisAntp ;
   private String[] P02B42_A5252DisAcc ;
   private short[] P02B42_A352DisArtTip ;
   private String[] P02B42_A4615DisTam ;
   private String[] P02B42_A4614DisMdlCod ;
   private String[] P02B42_A2009DisTipDis ;
   private boolean[] P02B42_n2009DisTipDis ;
   private byte[] P02B42_A390DisTipCol ;
   private boolean[] P02B42_n390DisTipCol ;
   private int[] P02B42_A363DisColNum ;
   private boolean[] P02B42_n363DisColNum ;
   private String[] P02B42_A362DisColNom ;
   private boolean[] P02B42_n362DisColNom ;
   private String[] P02B42_A337DisArtDsc ;
   private String[] P02B42_A335DisArtCod ;
   private String[] P02B42_A4720DisDishCod ;
}

final  class phdrcco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02B42", "SELECT EmprCod, DisCod, DisArtLar, DisArtMat, DisCliNum, DisAntpT, DisAntp, DisAcc, DisArtTip, DisTam, DisMdlCod, DisTipDis, DisTipCol, DisColNum, DisColNom, DisArtDsc, DisArtCod, DisDishCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02B43", "UPDATE TXPDISPOS SET DisArtLar=?, DisArtMat=?, DisCliNum=?, DisAntpT=?, DisAntp=?, DisAcc=?, DisArtTip=?, DisTam=?, DisTipDis=?, DisTipCol=?, DisColNum=?, DisColNom=?, DisArtDsc=?, DisArtCod=?, DisDishCod=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 26);
               ((String[]) buf[20])[0] = rslt.getString(17, 16);
               ((String[]) buf[21])[0] = rslt.getString(18, 12);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 4);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 13);
               }
               stmt.setString(13, (String)parms[16], 26);
               stmt.setString(14, (String)parms[17], 16);
               stmt.setString(15, (String)parms[18], 12);
               stmt.setString(16, (String)parms[19], 3);
               stmt.setInt(17, ((Number) parms[20]).intValue());
               return;
      }
   }

}

