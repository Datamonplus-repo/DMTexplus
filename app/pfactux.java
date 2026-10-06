package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfactux extends GXProcedure
{
   public pfactux( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfactux.class ), "" );
   }

   public pfactux( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pfactux.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pfactux.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfactux.this.AV63BarCod = aP1[0];
      this.aP1 = aP1;
      pfactux.this.AV64BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfactux.this.AV65BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfactux.this.AV84BarColNum = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE VTXTRINCACA

      */
      A11308AcFecMov = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11308AcFecMov = false ;
      A11309AcBarCod = AV63BarCod ;
      n11309AcBarCod = false ;
      A11310AcBarReo = AV64BarCodReo ;
      n11310AcBarReo = false ;
      A11311AcBarPar = AV65BarCodPar ;
      n11311AcBarPar = false ;
      A11316AcFoNuCo = AV84BarColNum ;
      n11316AcFoNuCo = false ;
      A11307AcTipMov = httpContext.getMessage( "COL", "") ;
      n11307AcTipMov = false ;
      A11312AcSitReg = (byte)(0) ;
      n11312AcSitReg = false ;
      /* Using cursor P00RW2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n11308AcFecMov), A11308AcFecMov, Boolean.valueOf(n11307AcTipMov), A11307AcTipMov, Boolean.valueOf(n11309AcBarCod), Integer.valueOf(A11309AcBarCod), Boolean.valueOf(n11310AcBarReo), Byte.valueOf(A11310AcBarReo), Boolean.valueOf(n11311AcBarPar), A11311AcBarPar, Boolean.valueOf(n11312AcSitReg), Byte.valueOf(A11312AcSitReg), Boolean.valueOf(n11316AcFoNuCo), Integer.valueOf(A11316AcFoNuCo)});
      /* Retrieving last key number assigned */
      /* Using cursor P00RW3 */
      pr_default.execute(1);
      A11306AcIdReg = P00RW3_A11306AcIdReg[0] ;
      pr_default.close(1);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTRINCACA");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfactux.this.A396EmprCod;
      this.aP1[0] = pfactux.this.AV63BarCod;
      this.aP2[0] = pfactux.this.AV64BarCodReo;
      this.aP3[0] = pfactux.this.AV65BarCodPar;
      this.aP4[0] = pfactux.this.AV84BarColNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfactux");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      A11311AcBarPar = "" ;
      A11307AcTipMov = "" ;
      scmdbuf = "" ;
      P00RW3_A11306AcIdReg = new int[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfactux__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00RW3_A11306AcIdReg
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV64BarCodReo ;
   private byte A11310AcBarReo ;
   private byte A11312AcSitReg ;
   private short Gx_err ;
   private int AV63BarCod ;
   private int AV84BarColNum ;
   private int GX_INS1510 ;
   private int A11309AcBarCod ;
   private int A11316AcFoNuCo ;
   private int A11306AcIdReg ;
   private String A396EmprCod ;
   private String AV65BarCodPar ;
   private String A11311AcBarPar ;
   private String A11307AcTipMov ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date A11308AcFecMov ;
   private boolean n11308AcFecMov ;
   private boolean n11309AcBarCod ;
   private boolean n11310AcBarReo ;
   private boolean n11311AcBarPar ;
   private boolean n11316AcFoNuCo ;
   private boolean n11307AcTipMov ;
   private boolean n11312AcSitReg ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00RW3_A11306AcIdReg ;
}

final  class pfactux__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00RW2", "INSERT INTO VTXTRINCACA(IAFecMov, IATipMov, IABarCod, IABarReo, IABarPar, IASitReg, IAFoColNu, IAEmpCod, IABarPie, IaPieHija) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "VTXTRINCACA")
         ,new ForEachCursor("P00RW3", "SELECT IAIdReg.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

