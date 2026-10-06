package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrnr extends GXProcedure
{
   public phdrnr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrnr.class ), "" );
   }

   public phdrnr( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 ,
                          String[] aP4 )
   {
      phdrnr.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      phdrnr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrnr.this.A5206Nr_albrecc = aP1[0];
      this.aP1 = aP1;
      phdrnr.this.AV8BarCod = aP2[0];
      this.aP2 = aP2;
      phdrnr.this.AV9BarCodReo = aP3[0];
      this.aP3 = aP3;
      phdrnr.this.AV10BarCodPar = aP4[0];
      this.aP4 = aP4;
      phdrnr.this.AV11DisCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n5213Nr_discod = false ;
      n5212Nr_barpar = false ;
      n5211Nr_barreo = false ;
      n5210Nr_barcod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01LW2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5213Nr_discod), Integer.valueOf(AV11DisCod), Boolean.valueOf(n5212Nr_barpar), AV10BarCodPar, Boolean.valueOf(n5211Nr_barreo), Byte.valueOf(AV9BarCodReo), Boolean.valueOf(n5210Nr_barcod), Integer.valueOf(AV8BarCod), A396EmprCod, Boolean.valueOf(n5206Nr_albrecc), Integer.valueOf(A5206Nr_albrecc)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrnr.this.A396EmprCod;
      this.aP1[0] = phdrnr.this.A5206Nr_albrecc;
      this.aP2[0] = phdrnr.this.AV8BarCod;
      this.aP3[0] = phdrnr.this.AV9BarCodReo;
      this.aP4[0] = phdrnr.this.AV10BarCodPar;
      this.aP5[0] = phdrnr.this.AV11DisCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A5212Nr_barpar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrnr__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte A5211Nr_barreo ;
   private short Gx_err ;
   private int A5206Nr_albrecc ;
   private int AV8BarCod ;
   private int AV11DisCod ;
   private int A5213Nr_discod ;
   private int A5210Nr_barcod ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String A5212Nr_barpar ;
   private boolean n5213Nr_discod ;
   private boolean n5212Nr_barpar ;
   private boolean n5211Nr_barreo ;
   private boolean n5210Nr_barcod ;
   private boolean n5206Nr_albrecc ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class phdrnr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01LW2", "UPDATE TXPNOTREC SET Nr_discod=?, Nr_barpar=?, Nr_barreo=?, Nr_barcod=?  WHERE EmprCod = ? and Nr_albrecc = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTREC")
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               return;
      }
   }

}

