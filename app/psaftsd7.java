package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psaftsd7 extends GXProcedure
{
   public psaftsd7( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psaftsd7.class ), "" );
   }

   public psaftsd7( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      psaftsd7.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      psaftsd7.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psaftsd7.this.A13418AlbProID = aP1[0];
      this.aP1 = aP1;
      psaftsd7.this.AV16ALbLic = aP2[0];
      this.aP2 = aP2;
      psaftsd7.this.AV17AlbEnvFtp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P05Z52 */
      pr_default.execute(0, new Object[] {AV16ALbLic, Byte.valueOf(AV17AlbEnvFtp), A396EmprCod, Integer.valueOf(A13418AlbProID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psaftsd7.this.A396EmprCod;
      this.aP1[0] = psaftsd7.this.A13418AlbProID;
      this.aP2[0] = psaftsd7.this.AV16ALbLic;
      this.aP3[0] = psaftsd7.this.AV17AlbEnvFtp;
      Application.commitDataStores(context, remoteHandle, pr_default, "psaftsd7");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A13436AlbProIDAT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psaftsd7__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A13438AlbProStAT ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String AV16ALbLic ;
   private String A13436AlbProIDAT ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class psaftsd7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05Z52", "UPDATE TXPCALPRO SET AlbProEnvA='M', AlbProIDAT=?, AlbProStAT=?  WHERE EmprCod = ? and AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

