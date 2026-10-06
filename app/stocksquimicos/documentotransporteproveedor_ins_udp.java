package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_ins_udp extends GXProcedure
{
   public documentotransporteproveedor_ins_udp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_ins_udp.class ), "" );
   }

   public documentotransporteproveedor_ins_udp( int remoteHandle ,
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
                        String aP6 ,
                        short aP7 ,
                        String aP8 ,
                        String aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             String aP6 ,
                             short aP7 ,
                             String aP8 ,
                             String aP9 )
   {
      documentotransporteproveedor_ins_udp.this.AV10emprcod = aP0;
      documentotransporteproveedor_ins_udp.this.AV8AlbProID = aP1;
      documentotransporteproveedor_ins_udp.this.AV9AlbProLinea = aP2;
      documentotransporteproveedor_ins_udp.this.AV11Prdnum = aP3;
      documentotransporteproveedor_ins_udp.this.AV16AlbProDsc = aP4;
      documentotransporteproveedor_ins_udp.this.AV12AlbProCnt = aP5;
      documentotransporteproveedor_ins_udp.this.AV13AlbProUnd = aP6;
      documentotransporteproveedor_ins_udp.this.AV14AlbProCajas = aP7;
      documentotransporteproveedor_ins_udp.this.AV15AlbProObsLin = aP8;
      documentotransporteproveedor_ins_udp.this.AV22albprolote = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25GXLvl3 = (byte)(0) ;
      n14401AlbProLote = false ;
      n13447AlbProObsL = false ;
      n13444AlbProUnd = false ;
      n13448AlbProDsc = false ;
      n13443AlbProCnt = false ;
      n13449AlbProCaja = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AII2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n14401AlbProLote), AV22albprolote, Boolean.valueOf(n13447AlbProObsL), AV15AlbProObsLin, Boolean.valueOf(n13444AlbProUnd), AV13AlbProUnd, AV11Prdnum, Boolean.valueOf(n13448AlbProDsc), AV16AlbProDsc, Boolean.valueOf(n13443AlbProCnt), AV12AlbProCnt, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(AV14AlbProCajas), AV10emprcod, Integer.valueOf(AV8AlbProID), Short.valueOf(AV9AlbProLinea)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV25GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
      /* End optimized UPDATE. */
      if ( AV25GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLALPRO

         */
         A396EmprCod = AV10emprcod ;
         A13418AlbProID = AV8AlbProID ;
         A13442AlbProLine = AV9AlbProLinea ;
         A13449AlbProCaja = AV14AlbProCajas ;
         n13449AlbProCaja = false ;
         A13443AlbProCnt = AV12AlbProCnt ;
         n13443AlbProCnt = false ;
         A13448AlbProDsc = AV16AlbProDsc ;
         n13448AlbProDsc = false ;
         A719PrdNum = AV11Prdnum ;
         A13444AlbProUnd = AV13AlbProUnd ;
         n13444AlbProUnd = false ;
         A13447AlbProObsL = AV15AlbProObsLin ;
         n13447AlbProObsL = false ;
         A14401AlbProLote = AV22albprolote ;
         n14401AlbProLote = false ;
         /* Using cursor P0AII3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine), A719PrdNum, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n14401AlbProLote), A14401AlbProLote});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_ins_udp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A14401AlbProLote = "" ;
      A13447AlbProObsL = "" ;
      A13444AlbProUnd = "" ;
      A719PrdNum = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_ins_udp__default(),
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

   private byte AV25GXLvl3 ;
   private short AV9AlbProLinea ;
   private short AV14AlbProCajas ;
   private short A13449AlbProCaja ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int AV8AlbProID ;
   private int GX_INS1839 ;
   private int A13418AlbProID ;
   private java.math.BigDecimal AV12AlbProCnt ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String AV10emprcod ;
   private String AV11Prdnum ;
   private String AV16AlbProDsc ;
   private String AV13AlbProUnd ;
   private String AV15AlbProObsLin ;
   private String AV22albprolote ;
   private String A14401AlbProLote ;
   private String A13447AlbProObsL ;
   private String A13444AlbProUnd ;
   private String A719PrdNum ;
   private String A13448AlbProDsc ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private boolean n14401AlbProLote ;
   private boolean n13447AlbProObsL ;
   private boolean n13444AlbProUnd ;
   private boolean n13448AlbProDsc ;
   private boolean n13443AlbProCnt ;
   private boolean n13449AlbProCaja ;
   private IDataStoreProvider pr_default ;
}

final  class documentotransporteproveedor_ins_udp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AII2", "UPDATE TXPLALPRO SET AlbProLote=?, AlbProObsL=?, AlbProUnd=?, PrdNum=?, AlbProDsc=?, AlbProCnt=?, AlbProCaja=?  WHERE EmprCod = ? and AlbProID = ? and AlbProLine = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRO")
         ,new UpdateCursor("P0AII3", "INSERT INTO TXPLALPRO(EmprCod, AlbProID, AlbProLine, PrdNum, AlbProCnt, AlbProUnd, AlbProObsL, AlbProDsc, AlbProCaja, AlbProLote, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRO")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 60);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               stmt.setString(4, (String)parms[6], 6);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 60);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               stmt.setString(8, (String)parms[13], 3);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setShort(10, ((Number) parms[15]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 60);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 60);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 26);
               }
               return;
      }
   }

}

