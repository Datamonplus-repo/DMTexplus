package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetatinte05_prc extends GXProcedure
{
   public recetatinte05_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetatinte05_prc.class ), "" );
   }

   public recetatinte05_prc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 )
   {
      recetatinte05_prc.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        byte aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             byte aP5 ,
                             String[] aP6 )
   {
      recetatinte05_prc.this.A396EmprCod = aP0;
      recetatinte05_prc.this.A129BarCod = aP1;
      recetatinte05_prc.this.A132BarCodReo = aP2;
      recetatinte05_prc.this.A130BarCodPar = aP3;
      recetatinte05_prc.this.A2804RecLinMaq = aP4;
      recetatinte05_prc.this.AV8Reclinpro = aP5;
      recetatinte05_prc.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9errmensaje = "" ;
      /* Using cursor P09AN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1273RecLinPro = P09AN2_A1273RecLinPro[0] ;
         if ( AV8Reclinpro == A1273RecLinPro )
         {
            AV9errmensaje = httpContext.getMessage( "Error.La linea agregada ", "") + GXutil.trim( GXutil.str( AV8Reclinpro, 2, 0)) + httpContext.getMessage( ", ya existe", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = recetatinte05_prc.this.AV9errmensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9errmensaje = "" ;
      scmdbuf = "" ;
      P09AN2_A396EmprCod = new String[] {""} ;
      P09AN2_A129BarCod = new int[1] ;
      P09AN2_A132BarCodReo = new byte[1] ;
      P09AN2_A130BarCodPar = new String[] {""} ;
      P09AN2_A2804RecLinMaq = new short[1] ;
      P09AN2_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetatinte05_prc__default(),
         new Object[] {
             new Object[] {
            P09AN2_A396EmprCod, P09AN2_A129BarCod, P09AN2_A132BarCodReo, P09AN2_A130BarCodPar, P09AN2_A2804RecLinMaq, P09AN2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Reclinpro ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String AV9errmensaje ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09AN2_A396EmprCod ;
   private int[] P09AN2_A129BarCod ;
   private byte[] P09AN2_A132BarCodReo ;
   private String[] P09AN2_A130BarCodPar ;
   private short[] P09AN2_A2804RecLinMaq ;
   private byte[] P09AN2_A1273RecLinPro ;
}

final  class recetatinte05_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AN2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

