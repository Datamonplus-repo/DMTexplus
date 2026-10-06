package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinbarnot extends GXProcedure
{
   public pinbarnot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinbarnot.class ), "" );
   }

   public pinbarnot( int remoteHandle ,
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
      pinbarnot.this.aP4 = new String[] {""};
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
      pinbarnot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinbarnot.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinbarnot.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinbarnot.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinbarnot.this.AV8vObs = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04KA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A646NotUltLin = P04KA2_A646NotUltLin[0] ;
         n646NotUltLin = P04KA2_n646NotUltLin[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV9NotUltLin = (byte)(A646NotUltLin+1) ;
         A646NotUltLin = (byte)(((AV9NotUltLin>9) ? 9 : AV9NotUltLin)) ;
         n646NotUltLin = false ;
         if ( AV9NotUltLin > 9 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 9 lineas ¡¡¡", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P04KA3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            if (true) break;
         }
         else
         {
            /*
               INSERT RECORD ON TABLE TXPBARNOT

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A188BarNotLin = AV9NotUltLin ;
            A187BarNotDsc = AV8vObs ;
            /* Using cursor P04KA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
            if ( (pr_default.getStatus(2) == 1) )
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
         }
         /* Using cursor P04KA5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinbarnot.this.A396EmprCod;
      this.aP1[0] = pinbarnot.this.A129BarCod;
      this.aP2[0] = pinbarnot.this.A132BarCodReo;
      this.aP3[0] = pinbarnot.this.A130BarCodPar;
      this.aP4[0] = pinbarnot.this.AV8vObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinbarnot");
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
      P04KA2_A396EmprCod = new String[] {""} ;
      P04KA2_A129BarCod = new int[1] ;
      P04KA2_A132BarCodReo = new byte[1] ;
      P04KA2_A130BarCodPar = new String[] {""} ;
      P04KA2_A646NotUltLin = new byte[1] ;
      P04KA2_n646NotUltLin = new boolean[] {false} ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A187BarNotDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinbarnot__default(),
         new Object[] {
             new Object[] {
            P04KA2_A396EmprCod, P04KA2_A129BarCod, P04KA2_A132BarCodReo, P04KA2_A130BarCodPar, P04KA2_A646NotUltLin, P04KA2_n646NotUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A646NotUltLin ;
   private byte W132BarCodReo ;
   private byte AV9NotUltLin ;
   private byte A188BarNotLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS17 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8vObs ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A187BarNotDsc ;
   private String Gx_emsg ;
   private boolean n646NotUltLin ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04KA2_A396EmprCod ;
   private int[] P04KA2_A129BarCod ;
   private byte[] P04KA2_A132BarCodReo ;
   private String[] P04KA2_A130BarCodPar ;
   private byte[] P04KA2_A646NotUltLin ;
   private boolean[] P04KA2_n646NotUltLin ;
}

final  class pinbarnot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04KA2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, NotUltLin FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04KA3", "UPDATE TXPBARCAD SET NotUltLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P04KA4", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P04KA5", "UPDATE TXPBARCAD SET NotUltLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 65);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

