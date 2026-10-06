package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pturope extends GXProcedure
{
   public pturope( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pturope.class ), "" );
   }

   public pturope( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pturope.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pturope.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pturope.this.A539HisBarCod = aP1[0];
      this.aP1 = aP1;
      pturope.this.A545HisCodReo = aP2[0];
      this.aP2 = aP2;
      pturope.this.A544HisCodPar = aP3[0];
      this.aP3 = aP3;
      pturope.this.AV9Opecod = aP4[0];
      this.aP4 = aP4;
      pturope.this.AV10Turno = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n12950HisOpeTur = false ;
      n12949HisOpecod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05MU2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n12950HisOpeTur), Byte.valueOf(AV10Turno), Boolean.valueOf(n12949HisOpecod), Integer.valueOf(AV9Opecod), A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pturope.this.A396EmprCod;
      this.aP1[0] = pturope.this.A539HisBarCod;
      this.aP2[0] = pturope.this.A545HisCodReo;
      this.aP3[0] = pturope.this.A544HisCodPar;
      this.aP4[0] = pturope.this.AV9Opecod;
      this.aP5[0] = pturope.this.AV10Turno;
      Application.commitDataStores(context, remoteHandle, pr_default, "pturope");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pturope__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A545HisCodReo ;
   private byte AV10Turno ;
   private byte A12950HisOpeTur ;
   private short Gx_err ;
   private int A539HisBarCod ;
   private int AV9Opecod ;
   private int A12949HisOpecod ;
   private String A396EmprCod ;
   private String A544HisCodPar ;
   private boolean n12950HisOpeTur ;
   private boolean n12949HisOpecod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pturope__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05MU2", "UPDATE TXPHISREO SET HisOpeTur=?, HisOpecod=?  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
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
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               return;
      }
   }

}

