package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodmav extends GXProcedure
{
   public pmodmav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodmav.class ), "" );
   }

   public pmodmav( int remoteHandle ,
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
      pmodmav.this.aP5 = new int[] {0};
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
      pmodmav.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodmav.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmodmav.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodmav.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmodmav.this.AV8BarMaqCod = aP4[0];
      this.aP4 = aP4;
      pmodmav.this.AV9BarVolMaq = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P00MI2 */
      pr_default.execute(0, new Object[] {AV8BarMaqCod, Integer.valueOf(AV9BarVolMaq), AV8BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodmav.this.A396EmprCod;
      this.aP1[0] = pmodmav.this.A129BarCod;
      this.aP2[0] = pmodmav.this.A132BarCodReo;
      this.aP3[0] = pmodmav.this.A130BarCodPar;
      this.aP4[0] = pmodmav.this.AV8BarMaqCod;
      this.aP5[0] = pmodmav.this.AV9BarVolMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodmav");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A180BarMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodmav__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9BarVolMaq ;
   private int A236BarVolMaq ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarMaqCod ;
   private String A180BarMaqCod ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodmav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00MI2", "UPDATE TXPBARCAD SET BarMaqGru=SUBSTR(?, 1, 4), BarVolMaq=?, BarMaqCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

