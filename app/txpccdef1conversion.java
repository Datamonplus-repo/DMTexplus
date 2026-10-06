package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpccdef1conversion extends GXProcedure
{
   public txpccdef1conversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpccdef1conversion.class ), "" );
   }

   public txpccdef1conversion( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPCCDEF1C2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14345CCVEspe2 = TXPCCDEF1C2_A14345CCVEspe2[0] ;
         A14347CCTLinWNor = TXPCCDEF1C2_A14347CCTLinWNor[0] ;
         A14346CCTLinVWor = TXPCCDEF1C2_A14346CCTLinVWor[0] ;
         A14344CCTLinDc2 = TXPCCDEF1C2_A14344CCTLinDc2[0] ;
         A13250CCVEspecif = TXPCCDEF1C2_A13250CCVEspecif[0] ;
         A13249CCVNorma = TXPCCDEF1C2_A13249CCVNorma[0] ;
         A11522CCVCod = TXPCCDEF1C2_A11522CCVCod[0] ;
         n11522CCVCod = TXPCCDEF1C2_n11522CCVCod[0] ;
         A11476CCTLinDscL = TXPCCDEF1C2_A11476CCTLinDscL[0] ;
         A4408CCTSta = TXPCCDEF1C2_A4408CCTSta[0] ;
         A4048CCTLinTpoI = TXPCCDEF1C2_A4048CCTLinTpoI[0] ;
         A4047CCTLinVarW = TXPCCDEF1C2_A4047CCTLinVarW[0] ;
         A4046CCTLinPict = TXPCCDEF1C2_A4046CCTLinPict[0] ;
         A4045CCTLinLgoD = TXPCCDEF1C2_A4045CCTLinLgoD[0] ;
         A4044CCTLinTpoD = TXPCCDEF1C2_A4044CCTLinTpoD[0] ;
         A4043CCTLinDsc = TXPCCDEF1C2_A4043CCTLinDsc[0] ;
         A4034CCTLin = TXPCCDEF1C2_A4034CCTLin[0] ;
         A4031CCTCod = TXPCCDEF1C2_A4031CCTCod[0] ;
         A396EmprCod = TXPCCDEF1C2_A396EmprCod[0] ;
         /*
            INSERT RECORD ON TABLE GXA0622

         */
         AV2EmprCod = A396EmprCod ;
         AV3CCTCod = A4031CCTCod ;
         AV4CCTLin = A4034CCTLin ;
         AV5CCTLinDsc = A4043CCTLinDsc ;
         AV6CCTLinTpoD = A4044CCTLinTpoD ;
         AV7CCTLinLgoD = A4045CCTLinLgoD ;
         AV8CCTLinPict = A4046CCTLinPict ;
         AV9CCTLinVarW = A4047CCTLinVarW ;
         AV10CCTLinTpoI = A4048CCTLinTpoI ;
         AV11CCTSta = A4408CCTSta ;
         AV12CCTLinDscL = A11476CCTLinDscL ;
         if ( TXPCCDEF1C2_n11522CCVCod[0] )
         {
            AV13CCVCod = " " ;
         }
         else
         {
            AV13CCVCod = A11522CCVCod ;
         }
         AV14CCVNorma = A13249CCVNorma ;
         AV15CCVEspecif = A13250CCVEspecif ;
         AV16CCTLinDc2 = A14344CCTLinDc2 ;
         AV17CCTLinVWor = A14346CCTLinVWor ;
         AV18CCTLinWNor = A14347CCTLinWNor ;
         AV19CCVEspe2 = A14345CCVEspe2 ;
         /* Using cursor TXPCCDEF1C3 */
         pr_default.execute(1, new Object[] {AV2EmprCod, Integer.valueOf(AV3CCTCod), Short.valueOf(AV4CCTLin), AV5CCTLinDsc, AV6CCTLinTpoD, Short.valueOf(AV7CCTLinLgoD), AV8CCTLinPict, AV9CCTLinVarW, AV10CCTLinTpoI, AV11CCTSta, AV12CCTLinDscL, AV13CCVCod, AV14CCVNorma, AV15CCVEspecif, AV16CCTLinDc2, AV17CCTLinVWor, AV18CCTLinWNor, AV19CCVEspe2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0622");
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpccdef1conversion");
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
      TXPCCDEF1C2_A14345CCVEspe2 = new String[] {""} ;
      TXPCCDEF1C2_A14347CCTLinWNor = new String[] {""} ;
      TXPCCDEF1C2_A14346CCTLinVWor = new String[] {""} ;
      TXPCCDEF1C2_A14344CCTLinDc2 = new String[] {""} ;
      TXPCCDEF1C2_A13250CCVEspecif = new String[] {""} ;
      TXPCCDEF1C2_A13249CCVNorma = new String[] {""} ;
      TXPCCDEF1C2_A11522CCVCod = new String[] {""} ;
      TXPCCDEF1C2_n11522CCVCod = new boolean[] {false} ;
      TXPCCDEF1C2_A11476CCTLinDscL = new String[] {""} ;
      TXPCCDEF1C2_A4408CCTSta = new String[] {""} ;
      TXPCCDEF1C2_A4048CCTLinTpoI = new String[] {""} ;
      TXPCCDEF1C2_A4047CCTLinVarW = new String[] {""} ;
      TXPCCDEF1C2_A4046CCTLinPict = new String[] {""} ;
      TXPCCDEF1C2_A4045CCTLinLgoD = new short[1] ;
      TXPCCDEF1C2_A4044CCTLinTpoD = new String[] {""} ;
      TXPCCDEF1C2_A4043CCTLinDsc = new String[] {""} ;
      TXPCCDEF1C2_A4034CCTLin = new short[1] ;
      TXPCCDEF1C2_A4031CCTCod = new int[1] ;
      TXPCCDEF1C2_A396EmprCod = new String[] {""} ;
      A14345CCVEspe2 = "" ;
      A14347CCTLinWNor = "" ;
      A14346CCTLinVWor = "" ;
      A14344CCTLinDc2 = "" ;
      A13250CCVEspecif = "" ;
      A13249CCVNorma = "" ;
      A11522CCVCod = "" ;
      A11476CCTLinDscL = "" ;
      A4408CCTSta = "" ;
      A4048CCTLinTpoI = "" ;
      A4047CCTLinVarW = "" ;
      A4046CCTLinPict = "" ;
      A4044CCTLinTpoD = "" ;
      A4043CCTLinDsc = "" ;
      A396EmprCod = "" ;
      AV2EmprCod = "" ;
      AV5CCTLinDsc = "" ;
      AV6CCTLinTpoD = "" ;
      AV8CCTLinPict = "" ;
      AV9CCTLinVarW = "" ;
      AV10CCTLinTpoI = "" ;
      AV11CCTSta = "" ;
      AV12CCTLinDscL = "" ;
      AV13CCVCod = "" ;
      AV14CCVNorma = "" ;
      AV15CCVEspecif = "" ;
      AV16CCTLinDc2 = "" ;
      AV17CCTLinVWor = "" ;
      AV18CCTLinWNor = "" ;
      AV19CCVEspe2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpccdef1conversion__default(),
         new Object[] {
             new Object[] {
            TXPCCDEF1C2_A14345CCVEspe2, TXPCCDEF1C2_A14347CCTLinWNor, TXPCCDEF1C2_A14346CCTLinVWor, TXPCCDEF1C2_A14344CCTLinDc2, TXPCCDEF1C2_A13250CCVEspecif, TXPCCDEF1C2_A13249CCVNorma, TXPCCDEF1C2_A11522CCVCod, TXPCCDEF1C2_n11522CCVCod, TXPCCDEF1C2_A11476CCTLinDscL, TXPCCDEF1C2_A4408CCTSta,
            TXPCCDEF1C2_A4048CCTLinTpoI, TXPCCDEF1C2_A4047CCTLinVarW, TXPCCDEF1C2_A4046CCTLinPict, TXPCCDEF1C2_A4045CCTLinLgoD, TXPCCDEF1C2_A4044CCTLinTpoD, TXPCCDEF1C2_A4043CCTLinDsc, TXPCCDEF1C2_A4034CCTLin, TXPCCDEF1C2_A4031CCTCod, TXPCCDEF1C2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4045CCTLinLgoD ;
   private short A4034CCTLin ;
   private short AV4CCTLin ;
   private short AV7CCTLinLgoD ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int GIGXA0622 ;
   private int AV3CCTCod ;
   private String scmdbuf ;
   private String A14347CCTLinWNor ;
   private String A14346CCTLinVWor ;
   private String A14344CCTLinDc2 ;
   private String A13250CCVEspecif ;
   private String A13249CCVNorma ;
   private String A11522CCVCod ;
   private String A4408CCTSta ;
   private String A4048CCTLinTpoI ;
   private String A4047CCTLinVarW ;
   private String A4046CCTLinPict ;
   private String A4044CCTLinTpoD ;
   private String A4043CCTLinDsc ;
   private String A396EmprCod ;
   private String AV2EmprCod ;
   private String AV5CCTLinDsc ;
   private String AV6CCTLinTpoD ;
   private String AV8CCTLinPict ;
   private String AV9CCTLinVarW ;
   private String AV10CCTLinTpoI ;
   private String AV11CCTSta ;
   private String AV13CCVCod ;
   private String AV14CCVNorma ;
   private String AV15CCVEspecif ;
   private String AV16CCTLinDc2 ;
   private String AV17CCTLinVWor ;
   private String AV18CCTLinWNor ;
   private String Gx_emsg ;
   private boolean n11522CCVCod ;
   private String A14345CCVEspe2 ;
   private String A11476CCTLinDscL ;
   private String AV12CCTLinDscL ;
   private String AV19CCVEspe2 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPCCDEF1C2_A14345CCVEspe2 ;
   private String[] TXPCCDEF1C2_A14347CCTLinWNor ;
   private String[] TXPCCDEF1C2_A14346CCTLinVWor ;
   private String[] TXPCCDEF1C2_A14344CCTLinDc2 ;
   private String[] TXPCCDEF1C2_A13250CCVEspecif ;
   private String[] TXPCCDEF1C2_A13249CCVNorma ;
   private String[] TXPCCDEF1C2_A11522CCVCod ;
   private boolean[] TXPCCDEF1C2_n11522CCVCod ;
   private String[] TXPCCDEF1C2_A11476CCTLinDscL ;
   private String[] TXPCCDEF1C2_A4408CCTSta ;
   private String[] TXPCCDEF1C2_A4048CCTLinTpoI ;
   private String[] TXPCCDEF1C2_A4047CCTLinVarW ;
   private String[] TXPCCDEF1C2_A4046CCTLinPict ;
   private short[] TXPCCDEF1C2_A4045CCTLinLgoD ;
   private String[] TXPCCDEF1C2_A4044CCTLinTpoD ;
   private String[] TXPCCDEF1C2_A4043CCTLinDsc ;
   private short[] TXPCCDEF1C2_A4034CCTLin ;
   private int[] TXPCCDEF1C2_A4031CCTCod ;
   private String[] TXPCCDEF1C2_A396EmprCod ;
}

final  class txpccdef1conversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPCCDEF1C2", "SELECT CCVEspe2, CCTLinWNor, CCTLinVWor, CCTLinDc2, CCVEspecif, CCVNorma, CCVCod, CCTLinDscL, CCTSta, CCTLinTpoI, CCTLinVarW, CCTLinPict, CCTLinLgoD, CCTLinTpoD, CCTLinDsc, CCTLin, CCTCod, EmprCod FROM TXPCCDef1 ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPCCDEF1C3", "INSERT INTO GXA0622(EmprCod, CCTCod, CCTLin, CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCTLinDscL, CCVCod, CCVNorma, CCVEspecif, CCTLinDc2, CCTLinVWor, CCTLinWNor, CCVEspe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "GXA0622")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 32);
               ((String[]) buf[2])[0] = rslt.getString(3, 32);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 32);
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 32);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 40);
               stmt.setVarchar(11, (String)parms[10], 2048, false);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setString(14, (String)parms[13], 30);
               stmt.setString(15, (String)parms[14], 60);
               stmt.setString(16, (String)parms[15], 32);
               stmt.setString(17, (String)parms[16], 32);
               stmt.setVarchar(18, (String)parms[17], 300, false);
               return;
      }
   }

}

