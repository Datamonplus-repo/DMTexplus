package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdibu extends GXProcedure
{
   public partdibu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdibu.class ), "" );
   }

   public partdibu( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           java.util.Date[] aP3 )
   {
      partdibu.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      partdibu.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdibu.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      partdibu.this.A1014DibInt = aP2[0];
      this.aP2 = aP2;
      partdibu.this.AV11ShaEstFch = aP3[0];
      this.aP3 = aP3;
      partdibu.this.AV12ShaEstMtr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Begin pArtDibU", "") );
      n1018DibMetRea = false ;
      n1015DibFecUlt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P031P2 */
      pr_default.execute(0, new Object[] {AV12ShaEstMtr, Boolean.valueOf(n1015DibFecUlt), AV11ShaEstFch, A396EmprCod, A1013DibCli, Integer.valueOf(A1014DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
      /* End optimized UPDATE. */
      n7981ShaEstMtr = false ;
      n7982ShaEstFch = false ;
      /* Optimized UPDATE. */
      /* Using cursor P031P3 */
      pr_default.execute(1, new Object[] {AV12ShaEstMtr, Boolean.valueOf(n7982ShaEstFch), AV11ShaEstFch, A396EmprCod, A1013DibCli, Integer.valueOf(A1014DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShablo");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "Return pArtDibU", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdibu.this.A396EmprCod;
      this.aP1[0] = partdibu.this.A1013DibCli;
      this.aP2[0] = partdibu.this.A1014DibInt;
      this.aP3[0] = partdibu.this.AV11ShaEstFch;
      this.aP4[0] = partdibu.this.AV12ShaEstMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "partdibu");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1015DibFecUlt = GXutil.nullDate() ;
      A7982ShaEstFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdibu__default(),
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

   private short Gx_err ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV12ShaEstMtr ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private java.util.Date AV11ShaEstFch ;
   private java.util.Date A1015DibFecUlt ;
   private java.util.Date A7982ShaEstFch ;
   private boolean n1018DibMetRea ;
   private boolean n1015DibFecUlt ;
   private boolean n7981ShaEstMtr ;
   private boolean n7982ShaEstFch ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class partdibu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P031P2", "UPDATE TXPCDIBUJ SET DibMetRea=DibMetRea + ?, DibFecUlt=?  WHERE EmprCod = ? and DibCli = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
         ,new UpdateCursor("P031P3", "UPDATE TXPShablo SET ShaEstMtr=ShaEstMtr + ?, ShaEstFch=?  WHERE (EmprCod = ?) AND (ShaDibCli = ?) AND (ShaDibInt = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShablo")
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
      }
   }

}

