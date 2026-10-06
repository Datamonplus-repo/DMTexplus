package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinscru extends GXProcedure
{
   public pinscru( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinscru.class ), "" );
   }

   public pinscru( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 )
   {
      pinscru.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pinscru.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinscru.this.AV20CliCod = aP1[0];
      this.aP1 = aP1;
      pinscru.this.AV21ForSer = aP2[0];
      this.aP2 = aP2;
      pinscru.this.AV22ForColNom = aP3[0];
      this.aP3 = aP3;
      pinscru.this.AV23ForColNum = aP4[0];
      this.aP4 = aP4;
      pinscru.this.AV24TipColCod = aP5[0];
      this.aP5 = aP5;
      pinscru.this.AV38Coste2 = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Coste2 = DecimalUtil.doubleToDec(0) ;
      if ( GXutil.strcmp(GXutil.substring( AV21ForSer, 1, 1), httpContext.getMessage( "B", "")) == 0 )
      {
         /* Using cursor P04412 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV20CliCod), AV21ForSer});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P04412_A65ArtCod[0] ;
            A252CliCod = P04412_A252CliCod[0] ;
            A93ArtPreMtr = P04412_A93ArtPreMtr[0] ;
            n93ArtPreMtr = P04412_n93ArtPreMtr[0] ;
            AV38Coste2 = A93ArtPreMtr ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinscru.this.A396EmprCod;
      this.aP1[0] = pinscru.this.AV20CliCod;
      this.aP2[0] = pinscru.this.AV21ForSer;
      this.aP3[0] = pinscru.this.AV22ForColNom;
      this.aP4[0] = pinscru.this.AV23ForColNum;
      this.aP5[0] = pinscru.this.AV24TipColCod;
      this.aP6[0] = pinscru.this.AV38Coste2;
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
      P04412_A396EmprCod = new String[] {""} ;
      P04412_A65ArtCod = new String[] {""} ;
      P04412_A252CliCod = new int[1] ;
      P04412_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04412_n93ArtPreMtr = new boolean[] {false} ;
      A65ArtCod = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinscru__default(),
         new Object[] {
             new Object[] {
            P04412_A396EmprCod, P04412_A65ArtCod, P04412_A252CliCod, P04412_A93ArtPreMtr, P04412_n93ArtPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24TipColCod ;
   private short Gx_err ;
   private int AV20CliCod ;
   private int AV23ForColNum ;
   private int A252CliCod ;
   private java.math.BigDecimal AV38Coste2 ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private String A396EmprCod ;
   private String AV21ForSer ;
   private String AV22ForColNom ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private boolean n93ArtPreMtr ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04412_A396EmprCod ;
   private String[] P04412_A65ArtCod ;
   private int[] P04412_A252CliCod ;
   private java.math.BigDecimal[] P04412_A93ArtPreMtr ;
   private boolean[] P04412_n93ArtPreMtr ;
}

final  class pinscru__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04412", "SELECT EmprCod, ArtCod, CliCod, ArtPreMtr FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
      }
   }

}

