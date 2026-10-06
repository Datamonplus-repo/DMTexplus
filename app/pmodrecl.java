package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodrecl extends GXProcedure
{
   public pmodrecl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodrecl.class ), "" );
   }

   public pmodrecl( int remoteHandle ,
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
      pmodrecl.this.aP4 = new String[] {""};
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
      pmodrecl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodrecl.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmodrecl.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodrecl.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmodrecl.this.AV8RecRecLan = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P017O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4298RecRecLan = P017O2_A4298RecRecLan[0] ;
         n4298RecRecLan = P017O2_n4298RecRecLan[0] ;
         A2804RecLinMaq = P017O2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A4298RecRecLan, httpContext.getMessage( "N", "")) == 0 )
         {
            A4298RecRecLan = AV8RecRecLan ;
            n4298RecRecLan = false ;
            /* Using cursor P017O3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n4298RecRecLan), A4298RecRecLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodrecl.this.A396EmprCod;
      this.aP1[0] = pmodrecl.this.A129BarCod;
      this.aP2[0] = pmodrecl.this.A132BarCodReo;
      this.aP3[0] = pmodrecl.this.A130BarCodPar;
      this.aP4[0] = pmodrecl.this.AV8RecRecLan;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodrecl");
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
      P017O2_A396EmprCod = new String[] {""} ;
      P017O2_A129BarCod = new int[1] ;
      P017O2_A132BarCodReo = new byte[1] ;
      P017O2_A130BarCodPar = new String[] {""} ;
      P017O2_A4298RecRecLan = new String[] {""} ;
      P017O2_n4298RecRecLan = new boolean[] {false} ;
      P017O2_A2804RecLinMaq = new short[1] ;
      A4298RecRecLan = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodrecl__default(),
         new Object[] {
             new Object[] {
            P017O2_A396EmprCod, P017O2_A129BarCod, P017O2_A132BarCodReo, P017O2_A130BarCodPar, P017O2_A4298RecRecLan, P017O2_n4298RecRecLan, P017O2_A2804RecLinMaq
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8RecRecLan ;
   private String scmdbuf ;
   private String A4298RecRecLan ;
   private boolean n4298RecRecLan ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P017O2_A396EmprCod ;
   private int[] P017O2_A129BarCod ;
   private byte[] P017O2_A132BarCodReo ;
   private String[] P017O2_A130BarCodPar ;
   private String[] P017O2_A4298RecRecLan ;
   private boolean[] P017O2_n4298RecRecLan ;
   private short[] P017O2_A2804RecLinMaq ;
}

final  class pmodrecl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P017O2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecRecLan, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P017O3", "UPDATE TXPRECMAQ SET RecRecLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

