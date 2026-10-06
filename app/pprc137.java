package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc137 extends GXProcedure
{
   public pprc137( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc137.class ), "" );
   }

   public pprc137( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 )
   {
      pprc137.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pprc137.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc137.this.A4364GrdTipArt = aP1[0];
      this.aP1 = aP1;
      pprc137.this.A12944FamCalID = aP2[0];
      this.aP2 = aP2;
      pprc137.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Error.La calidad no esta asociada a la Familia de Tipo de Articulo", "") ;
      /* Using cursor P05MJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Byte.valueOf(A12944FamCalID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         Gx_msg = " " ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc137.this.A396EmprCod;
      this.aP1[0] = pprc137.this.A4364GrdTipArt;
      this.aP2[0] = pprc137.this.A12944FamCalID;
      this.aP3[0] = pprc137.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05MJ2_A396EmprCod = new String[] {""} ;
      P05MJ2_A4364GrdTipArt = new short[1] ;
      P05MJ2_A12944FamCalID = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc137__default(),
         new Object[] {
             new Object[] {
            P05MJ2_A396EmprCod, P05MJ2_A4364GrdTipArt, P05MJ2_A12944FamCalID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12944FamCalID ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05MJ2_A396EmprCod ;
   private short[] P05MJ2_A4364GrdTipArt ;
   private byte[] P05MJ2_A12944FamCalID ;
}

final  class pprc137__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05MJ2", "SELECT EmprCod, GrdTipArt, FamCalID FROM TXPFAMCAL WHERE EmprCod = ? and GrdTipArt = ? and FamCalID = ? ORDER BY EmprCod, GrdTipArt, FamCalID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

