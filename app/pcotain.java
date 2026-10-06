package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcotain extends GXProcedure
{
   public pcotain( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcotain.class ), "" );
   }

   public pcotain( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 )
   {
      pcotain.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 )
   {
      pcotain.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcotain.this.AV16TipArtCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03A32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P03A32_A583IntCod[0] ;
         A396EmprCod = P03A32_A396EmprCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPTARINT

         */
         W396EmprCod = A396EmprCod ;
         W583IntCod = A583IntCod ;
         A396EmprCod = AV15EmprCod ;
         A829TipArtCod = AV16TipArtCod ;
         A8533TarIntCos = DecimalUtil.doubleToDec(0) ;
         n8533TarIntCos = false ;
         /* Using cursor P03A33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n8533TarIntCos), A8533TarIntCos});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTARINT");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A583IntCod = W583IntCod ;
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcotain.this.AV15EmprCod;
      this.aP1[0] = pcotain.this.AV16TipArtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcotain");
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
      P03A32_A583IntCod = new byte[1] ;
      P03A32_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      A8533TarIntCos = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcotain__default(),
         new Object[] {
             new Object[] {
            P03A32_A583IntCod, P03A32_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte W583IntCod ;
   private short AV16TipArtCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int GX_INS1171 ;
   private java.math.BigDecimal A8533TarIntCos ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n8533TarIntCos ;
   private short[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03A32_A583IntCod ;
   private String[] P03A32_A396EmprCod ;
}

final  class pcotain__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03A32", "SELECT IntCod, EmprCod FROM TXPINTENS WHERE ( IntCod >= 1 and IntCod <= 4) or IntCod = 9 ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03A33", "INSERT INTO TXPTARINT(EmprCod, TipArtCod, IntCod, TarIntCos) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTARINT")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               }
               return;
      }
   }

}

