package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_insupd extends GXProcedure
{
   public documentotransportecomercial_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_insupd.class ), "" );
   }

   public documentotransportecomercial_insupd( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        byte aP6 ,
                        java.math.BigDecimal aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             byte aP6 ,
                             java.math.BigDecimal aP7 )
   {
      documentotransportecomercial_insupd.this.AV14emprcod = aP0;
      documentotransportecomercial_insupd.this.AV13Albcomcod = aP1;
      documentotransportecomercial_insupd.this.AV12albComLin = aP2;
      documentotransportecomercial_insupd.this.AV11AlbComDsc = aP3;
      documentotransportecomercial_insupd.this.AV10AlbComDc2 = aP4;
      documentotransportecomercial_insupd.this.AV9AlbComCnt = aP5;
      documentotransportecomercial_insupd.this.AV8AlbComUni = aP6;
      documentotransportecomercial_insupd.this.AV15albcompre = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl2 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AHS2 */
      pr_default.execute(0, new Object[] {AV15albcompre, Byte.valueOf(AV8AlbComUni), AV11AlbComDsc, AV10AlbComDc2, AV9AlbComCnt, AV14emprcod, Integer.valueOf(AV13Albcomcod), Short.valueOf(AV12albComLin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV18GXLvl2 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
      /* End optimized UPDATE. */
      if ( AV18GXLvl2 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLALCOM

         */
         A396EmprCod = AV14emprcod ;
         A14AlbComCod = AV13Albcomcod ;
         A20AlbComLin = AV12albComLin ;
         A13AlbComCnt = AV9AlbComCnt ;
         A10806AlbComDc2 = AV10AlbComDc2 ;
         A15AlbComDsc = AV11AlbComDsc ;
         A4717AlbComUni = AV8AlbComUni ;
         A21AlbComPre = AV15albcompre ;
         /* Using cursor P0AHS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin), A15AlbComDsc, A13AlbComCnt, A21AlbComPre, Byte.valueOf(A4717AlbComUni), A10806AlbComDc2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A21AlbComPre = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A10806AlbComDc2 = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_insupd__default(),
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

   private byte AV8AlbComUni ;
   private byte AV18GXLvl2 ;
   private byte A4717AlbComUni ;
   private short AV12albComLin ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV13Albcomcod ;
   private int GX_INS2 ;
   private int A14AlbComCod ;
   private java.math.BigDecimal AV9AlbComCnt ;
   private java.math.BigDecimal AV15albcompre ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private String AV14emprcod ;
   private String AV11AlbComDsc ;
   private String AV10AlbComDc2 ;
   private String A15AlbComDsc ;
   private String A10806AlbComDc2 ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class documentotransportecomercial_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AHS2", "UPDATE TXPLALCOM SET AlbComPre=?, AlbComUni=?, AlbComDsc=?, AlbComDc2=?, AlbComCnt=?  WHERE EmprCod = ? and AlbComCod = ? and AlbComLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
         ,new UpdateCursor("P0AHS3", "INSERT INTO TXPLALCOM(EmprCod, AlbComCod, AlbComLin, AlbComDsc, AlbComCnt, AlbComPre, AlbComUni, AlbComDc2, AlbComHd, ALbComR, AlbComP, AlbComProd, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComKgs, AlbComArt, AlbComArtD, AlbComCol) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 100);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 100);
               return;
      }
   }

}

