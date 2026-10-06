package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partpar1 extends GXProcedure
{
   public partpar1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partpar1.class ), "" );
   }

   public partpar1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      partpar1.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      partpar1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partpar1.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partpar1.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      partpar1.this.AV14Par_art = aP3[0];
      this.aP3 = aP3;
      partpar1.this.AV12Par_nvar = aP4[0];
      this.aP4 = aP4;
      partpar1.this.AV13FlagR = aP5[0];
      this.aP5 = aP5;
      partpar1.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FlagR = (byte)(0) ;
      Gx_msg = " " ;
      /* Using cursor P04042 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(AV14Par_art), Short.valueOf(AV12Par_nvar)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10551Par_NVar = P04042_A10551Par_NVar[0] ;
         n10551Par_NVar = P04042_n10551Par_NVar[0] ;
         A7949Par_Art = P04042_A7949Par_Art[0] ;
         A7950Par_Dsc = P04042_A7950Par_Dsc[0] ;
         n7950Par_Dsc = P04042_n7950Par_Dsc[0] ;
         A10551Par_NVar = P04042_A10551Par_NVar[0] ;
         n10551Par_NVar = P04042_n10551Par_NVar[0] ;
         A7950Par_Dsc = P04042_A7950Par_Dsc[0] ;
         n7950Par_Dsc = P04042_n7950Par_Dsc[0] ;
         AV13FlagR = (byte)(1) ;
         Gx_msg = httpContext.getMessage( "Error.Este N Variable ", "") + GXutil.str( A10551Par_NVar, 4, 0) + httpContext.getMessage( " ya existe en", "") + GXutil.str( A7949Par_Art, 4, 0) + " " + GXutil.trim( A7950Par_Dsc) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partpar1.this.A396EmprCod;
      this.aP1[0] = partpar1.this.A252CliCod;
      this.aP2[0] = partpar1.this.A65ArtCod;
      this.aP3[0] = partpar1.this.AV14Par_art;
      this.aP4[0] = partpar1.this.AV12Par_nvar;
      this.aP5[0] = partpar1.this.AV13FlagR;
      this.aP6[0] = partpar1.this.Gx_msg;
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
      P04042_A396EmprCod = new String[] {""} ;
      P04042_A252CliCod = new int[1] ;
      P04042_A65ArtCod = new String[] {""} ;
      P04042_A10551Par_NVar = new short[1] ;
      P04042_n10551Par_NVar = new boolean[] {false} ;
      P04042_A7949Par_Art = new short[1] ;
      P04042_A7950Par_Dsc = new String[] {""} ;
      P04042_n7950Par_Dsc = new boolean[] {false} ;
      A7950Par_Dsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partpar1__default(),
         new Object[] {
             new Object[] {
            P04042_A396EmprCod, P04042_A252CliCod, P04042_A65ArtCod, P04042_A10551Par_NVar, P04042_n10551Par_NVar, P04042_A7949Par_Art, P04042_A7950Par_Dsc, P04042_n7950Par_Dsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13FlagR ;
   private short AV14Par_art ;
   private short AV12Par_nvar ;
   private short A10551Par_NVar ;
   private short A7949Par_Art ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A7950Par_Dsc ;
   private boolean n10551Par_NVar ;
   private boolean n7950Par_Dsc ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04042_A396EmprCod ;
   private int[] P04042_A252CliCod ;
   private String[] P04042_A65ArtCod ;
   private short[] P04042_A10551Par_NVar ;
   private boolean[] P04042_n10551Par_NVar ;
   private short[] P04042_A7949Par_Art ;
   private String[] P04042_A7950Par_Dsc ;
   private boolean[] P04042_n7950Par_Dsc ;
}

final  class partpar1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04042", "SELECT * FROM (SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.Par_NVar, T1.Par_Art, T2.Par_Dsc FROM (TXPARTTEJ T1 INNER JOIN TXPARTPAR T2 ON T2.EmprCod = T1.EmprCod AND T2.Par_Art = T1.Par_Art) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ?) AND (T1.Par_Art <> ?) AND (T2.Par_NVar = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Par_Art, T2.Par_NVar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 80);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

