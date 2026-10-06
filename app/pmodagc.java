package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodagc extends GXProcedure
{
   public pmodagc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodagc.class ), "" );
   }

   public pmodagc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 )
   {
      pmodagc.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      pmodagc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodagc.this.A119BarAgrCod = aP1[0];
      this.aP1 = aP1;
      pmodagc.this.A124BarAgrReo = aP2[0];
      this.aP2 = aP2;
      pmodagc.this.A122BarAgrPar = aP3[0];
      this.aP3 = aP3;
      pmodagc.this.AV15BarColNom = aP4[0];
      this.aP4 = aP4;
      pmodagc.this.AV16BarColNum = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P00ET2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV16BarColNum), AV15BarColNom, A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodagc.this.A396EmprCod;
      this.aP1[0] = pmodagc.this.A119BarAgrCod;
      this.aP2[0] = pmodagc.this.A124BarAgrReo;
      this.aP3[0] = pmodagc.this.A122BarAgrPar;
      this.aP4[0] = pmodagc.this.AV15BarColNom;
      this.aP5[0] = pmodagc.this.AV16BarColNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodagc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1510ColNomAgr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodagc__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int A119BarAgrCod ;
   private int AV16BarColNum ;
   private int A1512ColNumAgr ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String AV15BarColNom ;
   private String A1510ColNomAgr ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodagc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00ET2", "UPDATE TXPBARAGR SET ColNumAgr=?, ColNomAgr=?  WHERE (EmprCod = ?) AND (BarAgrCod = ?) AND (BarAgrReo = ?) AND (BarAgrPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 13);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

