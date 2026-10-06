package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pusudatm extends GXProcedure
{
   public pusudatm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pusudatm.class ), "" );
   }

   public pusudatm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pusudatm.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pusudatm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pusudatm.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pusudatm.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pusudatm.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pusudatm.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pusudatm.this.AV8UsurCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n4868RecUsrMod = false ;
      n4867RecFecMod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01XN2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n4868RecUsrMod), AV8UsurCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pusudatm.this.A396EmprCod;
      this.aP1[0] = pusudatm.this.A129BarCod;
      this.aP2[0] = pusudatm.this.A132BarCodReo;
      this.aP3[0] = pusudatm.this.A130BarCodPar;
      this.aP4[0] = pusudatm.this.A2804RecLinMaq;
      this.aP5[0] = pusudatm.this.AV8UsurCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pusudatm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4868RecUsrMod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pusudatm__default(),
         new Object[] {
             new Object[] {
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
   private String AV8UsurCod ;
   private String A4868RecUsrMod ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pusudatm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01XN2", "UPDATE TXPRECMAQ SET RecUsrMod=?, RecFecMod=(SYSDATE)  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
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

