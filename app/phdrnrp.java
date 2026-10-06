package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrnrp extends GXProcedure
{
   public phdrnrp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrnrp.class ), "" );
   }

   public phdrnrp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          int[] aP3 ,
                          byte[] aP4 ,
                          String[] aP5 )
   {
      phdrnrp.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      phdrnrp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrnrp.this.A7090Nr_PartCod = aP1[0];
      this.aP1 = aP1;
      phdrnrp.this.A5340Nr_CliCod = aP2[0];
      this.aP2 = aP2;
      phdrnrp.this.AV8BarCod = aP3[0];
      this.aP3 = aP3;
      phdrnrp.this.AV9BarCodReo = aP4[0];
      this.aP4 = aP4;
      phdrnrp.this.AV10BarCodPar = aP5[0];
      this.aP5 = aP5;
      phdrnrp.this.AV11DisCod = aP6[0];
      this.aP6 = aP6;
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
      /* Using cursor P02RR2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5213Nr_discod), Integer.valueOf(AV11DisCod), Boolean.valueOf(n5212Nr_barpar), AV10BarCodPar, Boolean.valueOf(n5211Nr_barreo), Byte.valueOf(AV9BarCodReo), Boolean.valueOf(n5210Nr_barcod), Integer.valueOf(AV8BarCod), A396EmprCod, Boolean.valueOf(n7090Nr_PartCod), A7090Nr_PartCod, Boolean.valueOf(n5340Nr_CliCod), Integer.valueOf(A5340Nr_CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrnrp.this.A396EmprCod;
      this.aP1[0] = phdrnrp.this.A7090Nr_PartCod;
      this.aP2[0] = phdrnrp.this.A5340Nr_CliCod;
      this.aP3[0] = phdrnrp.this.AV8BarCod;
      this.aP4[0] = phdrnrp.this.AV9BarCodReo;
      this.aP5[0] = phdrnrp.this.AV10BarCodPar;
      this.aP6[0] = phdrnrp.this.AV11DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrnrp");
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrnrp__default(),
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
   private int A5340Nr_CliCod ;
   private int AV8BarCod ;
   private int AV11DisCod ;
   private int A5213Nr_discod ;
   private int A5210Nr_barcod ;
   private String A396EmprCod ;
   private String A7090Nr_PartCod ;
   private String AV10BarCodPar ;
   private String A5212Nr_barpar ;
   private boolean n5213Nr_discod ;
   private boolean n5212Nr_barpar ;
   private boolean n5211Nr_barreo ;
   private boolean n5210Nr_barcod ;
   private boolean n7090Nr_PartCod ;
   private boolean n5340Nr_CliCod ;
   private int[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class phdrnrp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02RR2", "UPDATE TXPNOTREC SET Nr_discod=?, Nr_barpar=?, Nr_barreo=?, Nr_barcod=?  WHERE EmprCod = ? and Nr_PartCod = ? and Nr_CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTREC")
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               return;
      }
   }

}

