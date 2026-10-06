package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prennotas extends GXProcedure
{
   public prennotas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prennotas.class ), "" );
   }

   public prennotas( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      prennotas.this.A396EmprCod = aP0;
      prennotas.this.A129BarCod = aP1;
      prennotas.this.A132BarCodReo = aP2;
      prennotas.this.A130BarCodPar = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EmprCod = "999" ;
      /* Using cursor P09852 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A187BarNotDsc = P09852_A187BarNotDsc[0] ;
         A188BarNotLin = P09852_A188BarNotLin[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARNOT

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W188BarNotLin = A188BarNotLin ;
         A396EmprCod = AV8EmprCod ;
         /* Using cursor P09853 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A188BarNotLin = W188BarNotLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P09854 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
      /* End optimized DELETE. */
      AV12BarNotLin = (byte)(1) ;
      /* Using cursor P09855 */
      pr_default.execute(3, new Object[] {AV8EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A188BarNotLin = P09855_A188BarNotLin[0] ;
         A187BarNotDsc = P09855_A187BarNotDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARNOT

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W188BarNotLin = A188BarNotLin ;
         A188BarNotLin = AV12BarNotLin ;
         /* Using cursor P09856 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
         if ( (pr_default.getStatus(4) == 1) )
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
         A188BarNotLin = W188BarNotLin ;
         /* End Insert */
         AV12BarNotLin = (byte)(AV12BarNotLin+1) ;
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Optimized DELETE. */
      /* Using cursor P09857 */
      pr_default.execute(5, new Object[] {AV8EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
      /* End optimized DELETE. */
      n646NotUltLin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P09858 */
      pr_default.execute(6, new Object[] {Byte.valueOf(AV12BarNotLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "prennotas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8EmprCod = "" ;
      scmdbuf = "" ;
      P09852_A396EmprCod = new String[] {""} ;
      P09852_A129BarCod = new int[1] ;
      P09852_A132BarCodReo = new byte[1] ;
      P09852_A130BarCodPar = new String[] {""} ;
      P09852_A187BarNotDsc = new String[] {""} ;
      P09852_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      Gx_emsg = "" ;
      P09855_A129BarCod = new int[1] ;
      P09855_A132BarCodReo = new byte[1] ;
      P09855_A130BarCodPar = new String[] {""} ;
      P09855_A188BarNotLin = new byte[1] ;
      P09855_A187BarNotDsc = new String[] {""} ;
      P09855_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prennotas__default(),
         new Object[] {
             new Object[] {
            P09852_A396EmprCod, P09852_A129BarCod, P09852_A132BarCodReo, P09852_A130BarCodPar, P09852_A187BarNotDsc, P09852_A188BarNotLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09855_A129BarCod, P09855_A132BarCodReo, P09855_A130BarCodPar, P09855_A188BarNotLin, P09855_A187BarNotDsc, P09855_A396EmprCod
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
   private byte A188BarNotLin ;
   private byte W132BarCodReo ;
   private byte W188BarNotLin ;
   private byte AV12BarNotLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS17 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A187BarNotDsc ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String Gx_emsg ;
   private boolean n646NotUltLin ;
   private IDataStoreProvider pr_default ;
   private String[] P09852_A396EmprCod ;
   private int[] P09852_A129BarCod ;
   private byte[] P09852_A132BarCodReo ;
   private String[] P09852_A130BarCodPar ;
   private String[] P09852_A187BarNotDsc ;
   private byte[] P09852_A188BarNotLin ;
   private int[] P09855_A129BarCod ;
   private byte[] P09855_A132BarCodReo ;
   private String[] P09855_A130BarCodPar ;
   private byte[] P09855_A188BarNotLin ;
   private String[] P09855_A187BarNotDsc ;
   private String[] P09855_A396EmprCod ;
}

final  class prennotas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09852", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09853", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P09854", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new ForEachCursor("P09855", "SELECT BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc, EmprCod FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09856", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P09857", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P09858", "UPDATE TXPBARCAD SET NotUltLin=? - 1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 65);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 65);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

