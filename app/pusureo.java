package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pusureo extends GXProcedure
{
   public pusureo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pusureo.class ), "" );
   }

   public pusureo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pusureo.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pusureo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pusureo.this.A539HisBarCod = aP1[0];
      this.aP1 = aP1;
      pusureo.this.A545HisCodReo = aP2[0];
      this.aP2 = aP2;
      pusureo.this.A544HisCodPar = aP3[0];
      this.aP3 = aP3;
      pusureo.this.AV8Usurcod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n8414HisUsu = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03812 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n8414HisUsu), AV8Usurcod, A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pusureo.this.A396EmprCod;
      this.aP1[0] = pusureo.this.A539HisBarCod;
      this.aP2[0] = pusureo.this.A545HisCodReo;
      this.aP3[0] = pusureo.this.A544HisCodPar;
      this.aP4[0] = pusureo.this.AV8Usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pusureo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A8414HisUsu = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pusureo__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A545HisCodReo ;
   private short Gx_err ;
   private int A539HisBarCod ;
   private String A396EmprCod ;
   private String A544HisCodPar ;
   private String AV8Usurcod ;
   private String A8414HisUsu ;
   private boolean n8414HisUsu ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pusureo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03812", "UPDATE TXPHISREO SET HisUsu=?  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
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
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

