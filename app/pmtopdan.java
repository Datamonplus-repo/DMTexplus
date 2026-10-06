package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtopdan extends GXProcedure
{
   public pmtopdan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtopdan.class ), "" );
   }

   public pmtopdan( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pmtopdan.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pmtopdan.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      pmtopdan.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      pmtopdan.this.AV10barcodreo = aP2[0];
      this.aP2 = aP2;
      pmtopdan.this.AV11barcodpar = aP3[0];
      this.aP3 = aP3;
      pmtopdan.this.AV12BarEnccli = aP4[0];
      this.aP4 = aP4;
      pmtopdan.this.AV13BarPart = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPINSLOT

      */
      A396EmprCod = AV8Emprcod ;
      A13524InsHdr = GXutil.str( AV9Barcod, 8, 0) + GXutil.str( AV10barcodreo, 1, 0) + AV11barcodpar ;
      A13525InsMacCod = 0 ;
      n13525InsMacCod = false ;
      A13526InsLote = 0 ;
      n13526InsLote = false ;
      A13527InsEncPda = AV12BarEnccli + GXutil.str( AV13BarPart, 4, 0) ;
      n13527InsEncPda = false ;
      /* Using cursor P062D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A13524InsHdr, Boolean.valueOf(n13525InsMacCod), Integer.valueOf(A13525InsMacCod), Boolean.valueOf(n13526InsLote), Integer.valueOf(A13526InsLote), Boolean.valueOf(n13527InsEncPda), A13527InsEncPda});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSLOT");
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
      this.aP0[0] = pmtopdan.this.AV8Emprcod;
      this.aP1[0] = pmtopdan.this.AV9Barcod;
      this.aP2[0] = pmtopdan.this.AV10barcodreo;
      this.aP3[0] = pmtopdan.this.AV11barcodpar;
      this.aP4[0] = pmtopdan.this.AV12BarEnccli;
      this.aP5[0] = pmtopdan.this.AV13BarPart;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmtopdan");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A13524InsHdr = "" ;
      A13527InsEncPda = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtopdan__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private short AV13BarPart ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int GX_INS1851 ;
   private int A13525InsMacCod ;
   private int A13526InsLote ;
   private String AV8Emprcod ;
   private String AV11barcodpar ;
   private String AV12BarEnccli ;
   private String A396EmprCod ;
   private String A13524InsHdr ;
   private String A13527InsEncPda ;
   private String Gx_emsg ;
   private boolean n13525InsMacCod ;
   private boolean n13526InsLote ;
   private boolean n13527InsEncPda ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pmtopdan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P062D2", "INSERT INTO TXPINSLOT(EmprCod, InsHdr, InsMacCod, InsLote, InsEncPda) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSLOT")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 24);
               }
               return;
      }
   }

}

