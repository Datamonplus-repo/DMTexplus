package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac002 extends GXProcedure
{
   public prac002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac002.class ), "" );
   }

   public prac002( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      prac002.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      prac002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac002.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      prac002.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac002.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12RecLinMaq = (short)(0) ;
      /* Using cursor P027U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P027U2_A129BarCod[0] ;
         A132BarCodReo = P027U2_A132BarCodReo[0] ;
         A130BarCodPar = P027U2_A130BarCodPar[0] ;
         A2804RecLinMaq = P027U2_A2804RecLinMaq[0] ;
         AV12RecLinMaq = A2804RecLinMaq ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      n2803UltLinMaq = false ;
      /* Optimized UPDATE. */
      /* Using cursor P027U3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n2803UltLinMaq), Short.valueOf(AV12RecLinMaq), A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac002.this.A396EmprCod;
      this.aP1[0] = prac002.this.AV8BarCod;
      this.aP2[0] = prac002.this.AV9BarCodReo;
      this.aP3[0] = prac002.this.AV10BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "prac002");
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
      P027U2_A396EmprCod = new String[] {""} ;
      P027U2_A129BarCod = new int[1] ;
      P027U2_A132BarCodReo = new byte[1] ;
      P027U2_A130BarCodPar = new String[] {""} ;
      P027U2_A2804RecLinMaq = new short[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac002__default(),
         new Object[] {
             new Object[] {
            P027U2_A396EmprCod, P027U2_A129BarCod, P027U2_A132BarCodReo, P027U2_A130BarCodPar, P027U2_A2804RecLinMaq
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte A132BarCodReo ;
   private short AV12RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A2803UltLinMaq ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private boolean n2803UltLinMaq ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P027U2_A396EmprCod ;
   private int[] P027U2_A129BarCod ;
   private byte[] P027U2_A132BarCodReo ;
   private String[] P027U2_A130BarCodPar ;
   private short[] P027U2_A2804RecLinMaq ;
}

final  class prac002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027U2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P027U3", "UPDATE TXPBARCAD SET UltLinMaq=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

