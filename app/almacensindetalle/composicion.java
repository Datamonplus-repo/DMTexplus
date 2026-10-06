package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class composicion extends GXProcedure
{
   public composicion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( composicion.class ), "" );
   }

   public composicion( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      composicion.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      composicion.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      composicion.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      composicion.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      composicion.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Composicion = "" ;
      /* Using cursor P09IC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A105ArtTra1 = P09IC2_A105ArtTra1[0] ;
         n105ArtTra1 = P09IC2_n105ArtTra1[0] ;
         A108ArtTraP1 = P09IC2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P09IC2_n108ArtTraP1[0] ;
         A106ArtTra2 = P09IC2_A106ArtTra2[0] ;
         n106ArtTra2 = P09IC2_n106ArtTra2[0] ;
         A109ArtTraP2 = P09IC2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P09IC2_n109ArtTraP2[0] ;
         A107ArtTra3 = P09IC2_A107ArtTra3[0] ;
         n107ArtTra3 = P09IC2_n107ArtTra3[0] ;
         A110ArtTraP3 = P09IC2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P09IC2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P09IC2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P09IC2_n111ArtUrd1[0] ;
         A114ArtUrdP1 = P09IC2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P09IC2_n114ArtUrdP1[0] ;
         A112ArtUrd2 = P09IC2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P09IC2_n112ArtUrd2[0] ;
         A115ArtUrdP2 = P09IC2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P09IC2_n115ArtUrdP2[0] ;
         A113ArtUrd3 = P09IC2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P09IC2_n113ArtUrd3[0] ;
         A116ArtUrdP3 = P09IC2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P09IC2_n116ArtUrdP3[0] ;
         AV9Composicion = GXutil.str( A108ArtTraP1, 3, 0) + " " + GXutil.trim( A105ArtTra1) + " " ;
         if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
         {
            AV9Composicion += GXutil.str( A109ArtTraP2, 3, 0) + " " + GXutil.trim( A106ArtTra2) + " " ;
         }
         if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
         {
            AV9Composicion += GXutil.str( A110ArtTraP3, 3, 0) + " " + GXutil.trim( A107ArtTra3) + " " ;
         }
         if ( ! (GXutil.strcmp("", A111ArtUrd1)==0) )
         {
            AV9Composicion += "-" + GXutil.str( A114ArtUrdP1, 3, 0) + " " + GXutil.trim( A111ArtUrd1) + " " ;
         }
         if ( ! (GXutil.strcmp("", A112ArtUrd2)==0) )
         {
            AV9Composicion += GXutil.str( A115ArtUrdP2, 3, 0) + " " + GXutil.trim( A112ArtUrd2) + " " ;
         }
         if ( ! (GXutil.strcmp("", A113ArtUrd3)==0) )
         {
            AV9Composicion += GXutil.str( A116ArtUrdP3, 3, 0) + " " + GXutil.trim( A113ArtUrd3) + " " ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = composicion.this.A396EmprCod;
      this.aP1[0] = composicion.this.A252CliCod;
      this.aP2[0] = composicion.this.A65ArtCod;
      this.aP3[0] = composicion.this.AV9Composicion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Composicion = "" ;
      scmdbuf = "" ;
      P09IC2_A396EmprCod = new String[] {""} ;
      P09IC2_A252CliCod = new int[1] ;
      P09IC2_A65ArtCod = new String[] {""} ;
      P09IC2_A105ArtTra1 = new String[] {""} ;
      P09IC2_n105ArtTra1 = new boolean[] {false} ;
      P09IC2_A108ArtTraP1 = new short[1] ;
      P09IC2_n108ArtTraP1 = new boolean[] {false} ;
      P09IC2_A106ArtTra2 = new String[] {""} ;
      P09IC2_n106ArtTra2 = new boolean[] {false} ;
      P09IC2_A109ArtTraP2 = new short[1] ;
      P09IC2_n109ArtTraP2 = new boolean[] {false} ;
      P09IC2_A107ArtTra3 = new String[] {""} ;
      P09IC2_n107ArtTra3 = new boolean[] {false} ;
      P09IC2_A110ArtTraP3 = new short[1] ;
      P09IC2_n110ArtTraP3 = new boolean[] {false} ;
      P09IC2_A111ArtUrd1 = new String[] {""} ;
      P09IC2_n111ArtUrd1 = new boolean[] {false} ;
      P09IC2_A114ArtUrdP1 = new short[1] ;
      P09IC2_n114ArtUrdP1 = new boolean[] {false} ;
      P09IC2_A112ArtUrd2 = new String[] {""} ;
      P09IC2_n112ArtUrd2 = new boolean[] {false} ;
      P09IC2_A115ArtUrdP2 = new short[1] ;
      P09IC2_n115ArtUrdP2 = new boolean[] {false} ;
      P09IC2_A113ArtUrd3 = new String[] {""} ;
      P09IC2_n113ArtUrd3 = new boolean[] {false} ;
      P09IC2_A116ArtUrdP3 = new short[1] ;
      P09IC2_n116ArtUrdP3 = new boolean[] {false} ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.composicion__default(),
         new Object[] {
             new Object[] {
            P09IC2_A396EmprCod, P09IC2_A252CliCod, P09IC2_A65ArtCod, P09IC2_A105ArtTra1, P09IC2_n105ArtTra1, P09IC2_A108ArtTraP1, P09IC2_n108ArtTraP1, P09IC2_A106ArtTra2, P09IC2_n106ArtTra2, P09IC2_A109ArtTraP2,
            P09IC2_n109ArtTraP2, P09IC2_A107ArtTra3, P09IC2_n107ArtTra3, P09IC2_A110ArtTraP3, P09IC2_n110ArtTraP3, P09IC2_A111ArtUrd1, P09IC2_n111ArtUrd1, P09IC2_A114ArtUrdP1, P09IC2_n114ArtUrdP1, P09IC2_A112ArtUrd2,
            P09IC2_n112ArtUrd2, P09IC2_A115ArtUrdP2, P09IC2_n115ArtUrdP2, P09IC2_A113ArtUrd3, P09IC2_n113ArtUrd3, P09IC2_A116ArtUrdP3, P09IC2_n116ArtUrdP3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV9Composicion ;
   private String scmdbuf ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n114ArtUrdP1 ;
   private boolean n112ArtUrd2 ;
   private boolean n115ArtUrdP2 ;
   private boolean n113ArtUrd3 ;
   private boolean n116ArtUrdP3 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09IC2_A396EmprCod ;
   private int[] P09IC2_A252CliCod ;
   private String[] P09IC2_A65ArtCod ;
   private String[] P09IC2_A105ArtTra1 ;
   private boolean[] P09IC2_n105ArtTra1 ;
   private short[] P09IC2_A108ArtTraP1 ;
   private boolean[] P09IC2_n108ArtTraP1 ;
   private String[] P09IC2_A106ArtTra2 ;
   private boolean[] P09IC2_n106ArtTra2 ;
   private short[] P09IC2_A109ArtTraP2 ;
   private boolean[] P09IC2_n109ArtTraP2 ;
   private String[] P09IC2_A107ArtTra3 ;
   private boolean[] P09IC2_n107ArtTra3 ;
   private short[] P09IC2_A110ArtTraP3 ;
   private boolean[] P09IC2_n110ArtTraP3 ;
   private String[] P09IC2_A111ArtUrd1 ;
   private boolean[] P09IC2_n111ArtUrd1 ;
   private short[] P09IC2_A114ArtUrdP1 ;
   private boolean[] P09IC2_n114ArtUrdP1 ;
   private String[] P09IC2_A112ArtUrd2 ;
   private boolean[] P09IC2_n112ArtUrd2 ;
   private short[] P09IC2_A115ArtUrdP2 ;
   private boolean[] P09IC2_n115ArtUrdP2 ;
   private String[] P09IC2_A113ArtUrd3 ;
   private boolean[] P09IC2_n113ArtUrd3 ;
   private short[] P09IC2_A116ArtUrdP3 ;
   private boolean[] P09IC2_n116ArtUrdP3 ;
}

final  class composicion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IC2", "SELECT EmprCod, CliCod, ArtCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3, ArtUrd1, ArtUrdP1, ArtUrd2, ArtUrdP2, ArtUrd3, ArtUrdP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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

