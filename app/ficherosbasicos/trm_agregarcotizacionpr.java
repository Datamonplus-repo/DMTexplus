package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trm_agregarcotizacionpr extends GXProcedure
{
   public trm_agregarcotizacionpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trm_agregarcotizacionpr.class ), "" );
   }

   public trm_agregarcotizacionpr( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        byte aP1 ,
                                                                        String aP2 )
   {
      trm_agregarcotizacionpr.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 )
   {
      trm_agregarcotizacionpr.this.AV8EmprCod = aP0;
      trm_agregarcotizacionpr.this.AV12TRMDivID = aP1;
      trm_agregarcotizacionpr.this.AV11TRMSDT_Data = aP2;
      trm_agregarcotizacionpr.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10TRMSDT.fromJSonString(AV11TRMSDT_Data, null);
      AV16i = (short)(1) ;
      while ( AV16i <= AV10TRMSDT.size() )
      {
         AV19GXLvl6 = (byte)(0) ;
         /* Using cursor P09QN2 */
         pr_default.execute(0, new Object[] {AV8EmprCod, Byte.valueOf(AV12TRMDivID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14106TRMFecha = P09QN2_A14106TRMFecha[0] ;
            A14105TRMDivID = P09QN2_A14105TRMDivID[0] ;
            A396EmprCod = P09QN2_A396EmprCod[0] ;
            A14110TRMAutMan = P09QN2_A14110TRMAutMan[0] ;
            A14108TRMCompra = P09QN2_A14108TRMCompra[0] ;
            A14109TRMVenta = P09QN2_A14109TRMVenta[0] ;
            if ( GXutil.dateCompare(A14106TRMFecha, GXutil.resetTime( ((app.core.SdtTRMSDT_TRMSDTItem)AV10TRMSDT.elementAt(-1+AV16i)).getgxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde())) )
            {
               AV19GXLvl6 = (byte)(1) ;
               if ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "A", "")) == 0 )
               {
                  A14108TRMCompra = CommonUtil.decimalVal( ((app.core.SdtTRMSDT_TRMSDTItem)AV10TRMSDT.elementAt(-1+AV16i)).getgxTv_SdtTRMSDT_TRMSDTItem_Valor(), ".") ;
                  A14109TRMVenta = CommonUtil.decimalVal( ((app.core.SdtTRMSDT_TRMSDTItem)AV10TRMSDT.elementAt(-1+AV16i)).getgxTv_SdtTRMSDT_TRMSDTItem_Valor(), ".") ;
               }
               /* Using cursor P09QN3 */
               pr_default.execute(1, new Object[] {A14108TRMCompra, A14109TRMVenta, A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV19GXLvl6 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPTRM

            */
            A396EmprCod = AV8EmprCod ;
            A14105TRMDivID = AV12TRMDivID ;
            A14106TRMFecha = GXutil.resetTime( GXutil.resetTime( ((app.core.SdtTRMSDT_TRMSDTItem)AV10TRMSDT.elementAt(-1+AV16i)).getgxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde()) );
            A14108TRMCompra = CommonUtil.decimalVal( ((app.core.SdtTRMSDT_TRMSDTItem)AV10TRMSDT.elementAt(-1+AV16i)).getgxTv_SdtTRMSDT_TRMSDTItem_Valor(), ".") ;
            A14109TRMVenta = CommonUtil.decimalVal( ((app.core.SdtTRMSDT_TRMSDTItem)AV10TRMSDT.elementAt(-1+AV16i)).getgxTv_SdtTRMSDT_TRMSDTItem_Valor(), ".") ;
            A14110TRMAutMan = httpContext.getMessage( "A", "") ;
            /* Using cursor P09QN4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha, A14108TRMCompra, A14109TRMVenta, A14110TRMAutMan});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
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
         }
         AV16i = (short)(AV16i+1) ;
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.trm_agregarcotizacionpr");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = trm_agregarcotizacionpr.this.AV9Messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.trm_agregarcotizacionpr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV10TRMSDT = new GXBaseCollection<app.core.SdtTRMSDT_TRMSDTItem>(app.core.SdtTRMSDT_TRMSDTItem.class, "TRMSDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P09QN2_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P09QN2_A14105TRMDivID = new byte[1] ;
      P09QN2_A396EmprCod = new String[] {""} ;
      P09QN2_A14110TRMAutMan = new String[] {""} ;
      P09QN2_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QN2_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A14110TRMAutMan = "" ;
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.trm_agregarcotizacionpr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.trm_agregarcotizacionpr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.trm_agregarcotizacionpr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.trm_agregarcotizacionpr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.trm_agregarcotizacionpr__default(),
         new Object[] {
             new Object[] {
            P09QN2_A14106TRMFecha, P09QN2_A14105TRMDivID, P09QN2_A396EmprCod, P09QN2_A14110TRMAutMan, P09QN2_A14108TRMCompra, P09QN2_A14109TRMVenta
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

   private byte AV12TRMDivID ;
   private byte AV19GXLvl6 ;
   private byte A14105TRMDivID ;
   private short AV16i ;
   private short Gx_err ;
   private int GX_INS1888 ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal A14109TRMVenta ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A14110TRMAutMan ;
   private String Gx_emsg ;
   private java.util.Date A14106TRMFecha ;
   private String AV11TRMSDT_Data ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09QN2_A14106TRMFecha ;
   private byte[] P09QN2_A14105TRMDivID ;
   private String[] P09QN2_A396EmprCod ;
   private String[] P09QN2_A14110TRMAutMan ;
   private java.math.BigDecimal[] P09QN2_A14108TRMCompra ;
   private java.math.BigDecimal[] P09QN2_A14109TRMVenta ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private GXBaseCollection<app.core.SdtTRMSDT_TRMSDTItem> AV10TRMSDT ;
}

final  class trm_agregarcotizacionpr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class trm_agregarcotizacionpr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class trm_agregarcotizacionpr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class trm_agregarcotizacionpr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class trm_agregarcotizacionpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QN2", "SELECT TRMFecha, TRMDivID, EmprCod, TRMAutMan, TRMCompra, TRMVenta FROM TXPTRM WHERE EmprCod = ? and TRMDivID = ? ORDER BY EmprCod, TRMDivID  FOR UPDATE OF TRMCompra, TRMVenta NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09QN3", "UPDATE TXPTRM SET TRMCompra=?, TRMVenta=?  WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTRM")
         ,new UpdateCursor("P09QN4", "INSERT INTO TXPTRM(EmprCod, TRMDivID, TRMFecha, TRMCompra, TRMVenta, TRMAutMan) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTRM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

