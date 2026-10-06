package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preciofase_ins_upd extends GXProcedure
{
   public preciofase_ins_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preciofase_ins_upd.class ), "" );
   }

   public preciofase_ins_upd( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal aP3 ,
                        java.math.BigDecimal aP4 ,
                        java.math.BigDecimal aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        String aP8 ,
                        java.math.BigDecimal aP9 ,
                        java.util.Date aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal aP3 ,
                             java.math.BigDecimal aP4 ,
                             java.math.BigDecimal aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             String aP8 ,
                             java.math.BigDecimal aP9 ,
                             java.util.Date aP10 )
   {
      preciofase_ins_upd.this.A396EmprCod = aP0;
      preciofase_ins_upd.this.A252CliCod = aP1;
      preciofase_ins_upd.this.A457FasCod = aP2;
      preciofase_ins_upd.this.AV8FasPreMtr = aP3;
      preciofase_ins_upd.this.AV9FasPreKgm = aP4;
      preciofase_ins_upd.this.AV10FasPreMt2 = aP5;
      preciofase_ins_upd.this.AV11FasPreU = aP6;
      preciofase_ins_upd.this.AV12FasPreKgF = aP7;
      preciofase_ins_upd.this.AV13FasKgsEnt = aP8;
      preciofase_ins_upd.this.AV14FasKgsMn = aP9;
      preciofase_ins_upd.this.AV16FasPreFAc = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19GXLvl3 = (byte)(0) ;
      n467FasPreMtr = false ;
      n4385FasPreFAc = false ;
      n10882FasPreU = false ;
      n12576FasPreMt2 = false ;
      n466FasPreKgm = false ;
      n12577FasPreKgF = false ;
      n12704FasKgsMn = false ;
      n13587FasKgsEnt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AM12 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n467FasPreMtr), AV8FasPreMtr, Boolean.valueOf(n4385FasPreFAc), AV16FasPreFAc, Boolean.valueOf(n10882FasPreU), Byte.valueOf(AV11FasPreU), Boolean.valueOf(n12576FasPreMt2), AV10FasPreMt2, Boolean.valueOf(n466FasPreKgm), AV9FasPreKgm, Boolean.valueOf(n12577FasPreKgF), AV12FasPreKgF, Boolean.valueOf(n12704FasKgsMn), AV14FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), AV13FasKgsEnt, A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV19GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
      /* End optimized UPDATE. */
      if ( AV19GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPREFAS

         */
         A13587FasKgsEnt = AV13FasKgsEnt ;
         n13587FasKgsEnt = false ;
         A12704FasKgsMn = AV14FasKgsMn ;
         n12704FasKgsMn = false ;
         A12577FasPreKgF = AV12FasPreKgF ;
         n12577FasPreKgF = false ;
         A466FasPreKgm = AV9FasPreKgm ;
         n466FasPreKgm = false ;
         A12576FasPreMt2 = AV10FasPreMt2 ;
         n12576FasPreMt2 = false ;
         A467FasPreMtr = AV8FasPreMtr ;
         n467FasPreMtr = false ;
         A10882FasPreU = AV11FasPreU ;
         n10882FasPreU = false ;
         A4385FasPreFAc = AV16FasPreFAc ;
         n4385FasPreFAc = false ;
         A470FasSumTin = "S" ;
         n470FasSumTin = false ;
         /* Using cursor P0AM13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
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
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.preciofase_ins_upd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A467FasPreMtr = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A12577FasPreKgF = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      A13587FasKgsEnt = "" ;
      A470FasSumTin = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_ins_upd__default(),
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

   private byte AV11FasPreU ;
   private byte AV19GXLvl3 ;
   private byte A10882FasPreU ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS85 ;
   private java.math.BigDecimal AV8FasPreMtr ;
   private java.math.BigDecimal AV9FasPreKgm ;
   private java.math.BigDecimal AV10FasPreMt2 ;
   private java.math.BigDecimal AV14FasKgsMn ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV12FasPreKgF ;
   private String AV13FasKgsEnt ;
   private String A12577FasPreKgF ;
   private String A13587FasKgsEnt ;
   private String A470FasSumTin ;
   private String Gx_emsg ;
   private java.util.Date AV16FasPreFAc ;
   private java.util.Date A4385FasPreFAc ;
   private boolean n467FasPreMtr ;
   private boolean n4385FasPreFAc ;
   private boolean n10882FasPreU ;
   private boolean n12576FasPreMt2 ;
   private boolean n466FasPreKgm ;
   private boolean n12577FasPreKgF ;
   private boolean n12704FasKgsMn ;
   private boolean n13587FasKgsEnt ;
   private boolean n470FasSumTin ;
   private IDataStoreProvider pr_default ;
}

final  class preciofase_ins_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AM12", "UPDATE TXPPREFAS SET FasPreMtr=?, FasPreFAc=?, FasPreU=?, FasPreMt2=?, FasPreKgm=?, FasPreKgF=?, FasKgsMn=?, FasKgsEnt=?  WHERE EmprCod = ? and CliCod = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
         ,new UpdateCursor("P0AM13", "INSERT INTO TXPPREFAS(EmprCod, CliCod, FasCod, FasPreMtr, FasPreKgm, FasSumTin, FasPreFAc, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, ClifsdUl, ClifsiUl, FasFactura) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
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
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 1);
               }
               return;
      }
   }

}

