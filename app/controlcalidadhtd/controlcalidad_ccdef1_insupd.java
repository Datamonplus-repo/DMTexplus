package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_insupd extends GXProcedure
{
   public controlcalidad_ccdef1_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_insupd.class ), "" );
   }

   public controlcalidad_ccdef1_insupd( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        short aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        String aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             short aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 )
   {
      controlcalidad_ccdef1_insupd.this.A396EmprCod = aP0;
      controlcalidad_ccdef1_insupd.this.A4031CCTCod = aP1;
      controlcalidad_ccdef1_insupd.this.AV8cctlin = aP2;
      controlcalidad_ccdef1_insupd.this.AV9CCTLinDsc = aP3;
      controlcalidad_ccdef1_insupd.this.AV10CCTLinDc2 = aP4;
      controlcalidad_ccdef1_insupd.this.AV11CCVNorma = aP5;
      controlcalidad_ccdef1_insupd.this.AV12CCTLinVarWrd = aP6;
      controlcalidad_ccdef1_insupd.this.AV13CCVEspe2 = aP7;
      controlcalidad_ccdef1_insupd.this.AV14CCTLinLgoDat = aP8;
      controlcalidad_ccdef1_insupd.this.AV15CCTLinPict = aP9;
      controlcalidad_ccdef1_insupd.this.AV16CCTSta = aP10;
      controlcalidad_ccdef1_insupd.this.AV18CCTLinTpoIng = aP11;
      controlcalidad_ccdef1_insupd.this.AV17CCTLinTpoDat = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21GXLvl3 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0APJ2 */
      pr_default.execute(0, new Object[] {AV17CCTLinTpoDat, AV18CCTLinTpoIng, AV16CCTSta, AV15CCTLinPict, Short.valueOf(AV14CCTLinLgoDat), AV13CCVEspe2, AV12CCTLinVarWrd, AV11CCVNorma, AV10CCTLinDc2, AV9CCTLinDsc, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(AV8cctlin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV21GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
      /* End optimized UPDATE. */
      if ( AV21GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCCDef1

         */
         A4034CCTLin = AV8cctlin ;
         A4043CCTLinDsc = AV9CCTLinDsc ;
         A14344CCTLinDc2 = AV10CCTLinDc2 ;
         A13249CCVNorma = AV11CCVNorma ;
         A4047CCTLinVarW = AV12CCTLinVarWrd ;
         A14345CCVEspe2 = AV13CCVEspe2 ;
         A4045CCTLinLgoD = AV14CCTLinLgoDat ;
         A4046CCTLinPict = AV15CCTLinPict ;
         A4408CCTSta = AV16CCTSta ;
         A4048CCTLinTpoI = AV18CCTLinTpoIng ;
         A4044CCTLinTpoD = AV17CCTLinTpoDat ;
         A14347CCTLinWNor = "" ;
         A14346CCTLinVWor = "" ;
         A11476CCTLinDscL = "" ;
         A11522CCVCod = "" ;
         /* Using cursor P0APJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4043CCTLinDsc, A4044CCTLinTpoD, Short.valueOf(A4045CCTLinLgoD), A4046CCTLinPict, A4047CCTLinVarW, A4048CCTLinTpoI, A4408CCTSta, A11476CCTLinDscL, A11522CCVCod, A13249CCVNorma, A14344CCTLinDc2, A14346CCTLinVWor, A14347CCTLinWNor, A14345CCVEspe2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
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
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccdef1_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A4408CCTSta = "" ;
      A4046CCTLinPict = "" ;
      A14345CCVEspe2 = "" ;
      A4047CCTLinVarW = "" ;
      A13249CCVNorma = "" ;
      A14344CCTLinDc2 = "" ;
      A4043CCTLinDsc = "" ;
      A14347CCTLinWNor = "" ;
      A14346CCTLinVWor = "" ;
      A11476CCTLinDscL = "" ;
      A11522CCVCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_insupd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl3 ;
   private short AV8cctlin ;
   private short AV14CCTLinLgoDat ;
   private short A4045CCTLinLgoD ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int GX_INS622 ;
   private String A396EmprCod ;
   private String AV9CCTLinDsc ;
   private String AV10CCTLinDc2 ;
   private String AV11CCVNorma ;
   private String AV12CCTLinVarWrd ;
   private String AV15CCTLinPict ;
   private String AV16CCTSta ;
   private String AV18CCTLinTpoIng ;
   private String AV17CCTLinTpoDat ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A4408CCTSta ;
   private String A4046CCTLinPict ;
   private String A4047CCTLinVarW ;
   private String A13249CCVNorma ;
   private String A14344CCTLinDc2 ;
   private String A4043CCTLinDsc ;
   private String A14347CCTLinWNor ;
   private String A14346CCTLinVWor ;
   private String A11522CCVCod ;
   private String Gx_emsg ;
   private String AV13CCVEspe2 ;
   private String A14345CCVEspe2 ;
   private String A11476CCTLinDscL ;
   private IDataStoreProvider pr_default ;
}

final  class controlcalidad_ccdef1_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0APJ2", "UPDATE TXPCCDef1 SET CCTLinTpoD=?, CCTLinTpoI=?, CCTSta=?, CCTLinPict=?, CCTLinLgoD=?, CCVEspe2=?, CCTLinVarW=?, CCVNorma=?, CCTLinDc2=?, CCTLinDsc=?  WHERE EmprCod = ? and CCTCod = ? and CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef1")
         ,new UpdateCursor("P0APJ3", "INSERT INTO TXPCCDef1(EmprCod, CCTCod, CCTLin, CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict, CCTLinVarW, CCTLinTpoI, CCTSta, CCTLinDscL, CCVCod, CCVNorma, CCTLinDc2, CCTLinVWor, CCTLinWNor, CCVEspe2, CCVEspecif) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 40);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 300, false);
               stmt.setString(7, (String)parms[6], 32);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 60);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
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
               stmt.setString(14, (String)parms[13], 60);
               stmt.setString(15, (String)parms[14], 32);
               stmt.setString(16, (String)parms[15], 32);
               stmt.setVarchar(17, (String)parms[16], 300, false);
               return;
      }
   }

}

