package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexiins extends GXProcedure
{
   public pexiins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexiins.class ), "" );
   }

   public pexiins( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pexiins.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pexiins.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexiins.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pexiins.this.AV9Lb_numero = aP2[0];
      this.aP2 = aP2;
      pexiins.this.AV10Lb_opcion = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03D22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Lb_numero), AV10Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P03D22_A5555Lb_opcion[0] ;
         A5532Lb_numero = P03D22_A5532Lb_numero[0] ;
         A5556Lb_UltLC = P03D22_A5556Lb_UltLC[0] ;
         W396EmprCod = A396EmprCod ;
         W5532Lb_numero = A5532Lb_numero ;
         AV11Lb_ultlc = A5556Lb_UltLC ;
         AV12No_insumo = (byte)(0) ;
         /* Using cursor P03D23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6544Lb_PTinC = P03D23_A6544Lb_PTinC[0] ;
            A6058Lb_soluc = P03D23_A6058Lb_soluc[0] ;
            A5558LB_CantC = P03D23_A5558LB_CantC[0] ;
            A719PrdNum = P03D23_A719PrdNum[0] ;
            A5557Lb_LineaC = P03D23_A5557Lb_LineaC[0] ;
            A14096Lb_fibra = P03D23_A14096Lb_fibra[0] ;
            A490ForPrdUMe = P03D23_A490ForPrdUMe[0] ;
            W396EmprCod = A396EmprCod ;
            W5532Lb_numero = A5532Lb_numero ;
            W5555Lb_opcion = A5555Lb_opcion ;
            if ( GXutil.strcmp(A719PrdNum, AV8PrdNum) != 0 )
            {
               AV12No_insumo = (byte)(1) ;
               /*
                  INSERT RECORD ON TABLE TXPENS003

               */
               W396EmprCod = A396EmprCod ;
               W5532Lb_numero = A5532Lb_numero ;
               W5555Lb_opcion = A5555Lb_opcion ;
               W5557Lb_LineaC = A5557Lb_LineaC ;
               W719PrdNum = A719PrdNum ;
               W490ForPrdUMe = A490ForPrdUMe ;
               W5558LB_CantC = A5558LB_CantC ;
               W6058Lb_soluc = A6058Lb_soluc ;
               W6544Lb_PTinC = A6544Lb_PTinC ;
               A5557Lb_LineaC = (short)(AV11Lb_ultlc+10) ;
               A719PrdNum = AV8PrdNum ;
               A5558LB_CantC = DecimalUtil.doubleToDec(0) ;
               A6058Lb_soluc = 0 ;
               A6544Lb_PTinC = (byte)(0) ;
               /* Using cursor P03D24 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A14096Lb_fibra});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
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
               A5532Lb_numero = W5532Lb_numero ;
               A5555Lb_opcion = W5555Lb_opcion ;
               A5557Lb_LineaC = W5557Lb_LineaC ;
               A719PrdNum = W719PrdNum ;
               A490ForPrdUMe = W490ForPrdUMe ;
               A5558LB_CantC = W5558LB_CantC ;
               A6058Lb_soluc = W6058Lb_soluc ;
               A6544Lb_PTinC = W6544Lb_PTinC ;
               /* End Insert */
            }
            A396EmprCod = W396EmprCod ;
            A5532Lb_numero = W5532Lb_numero ;
            A5555Lb_opcion = W5555Lb_opcion ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV12No_insumo == 1 )
         {
            A5556Lb_UltLC = (short)(AV11Lb_ultlc+10) ;
         }
         /* Using cursor P03D25 */
         pr_default.execute(3, new Object[] {Short.valueOf(A5556Lb_UltLC), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         A396EmprCod = W396EmprCod ;
         A5532Lb_numero = W5532Lb_numero ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexiins.this.A396EmprCod;
      this.aP1[0] = pexiins.this.AV8PrdNum;
      this.aP2[0] = pexiins.this.AV9Lb_numero;
      this.aP3[0] = pexiins.this.AV10Lb_opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexiins");
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
      P03D22_A396EmprCod = new String[] {""} ;
      P03D22_A5555Lb_opcion = new String[] {""} ;
      P03D22_A5532Lb_numero = new int[1] ;
      P03D22_A5556Lb_UltLC = new short[1] ;
      A5555Lb_opcion = "" ;
      W396EmprCod = "" ;
      P03D23_A396EmprCod = new String[] {""} ;
      P03D23_A5532Lb_numero = new int[1] ;
      P03D23_A5555Lb_opcion = new String[] {""} ;
      P03D23_A6544Lb_PTinC = new byte[1] ;
      P03D23_A6058Lb_soluc = new int[1] ;
      P03D23_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D23_A719PrdNum = new String[] {""} ;
      P03D23_A5557Lb_LineaC = new short[1] ;
      P03D23_A14096Lb_fibra = new String[] {""} ;
      P03D23_A490ForPrdUMe = new byte[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A14096Lb_fibra = "" ;
      W5555Lb_opcion = "" ;
      W719PrdNum = "" ;
      W5558LB_CantC = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexiins__default(),
         new Object[] {
             new Object[] {
            P03D22_A396EmprCod, P03D22_A5555Lb_opcion, P03D22_A5532Lb_numero, P03D22_A5556Lb_UltLC
            }
            , new Object[] {
            P03D23_A396EmprCod, P03D23_A5532Lb_numero, P03D23_A5555Lb_opcion, P03D23_A6544Lb_PTinC, P03D23_A6058Lb_soluc, P03D23_A5558LB_CantC, P03D23_A719PrdNum, P03D23_A5557Lb_LineaC, P03D23_A14096Lb_fibra, P03D23_A490ForPrdUMe
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

   private byte AV12No_insumo ;
   private byte A6544Lb_PTinC ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte W6544Lb_PTinC ;
   private short A5556Lb_UltLC ;
   private short AV11Lb_ultlc ;
   private short A5557Lb_LineaC ;
   private short W5557Lb_LineaC ;
   private short Gx_err ;
   private int AV9Lb_numero ;
   private int A5532Lb_numero ;
   private int W5532Lb_numero ;
   private int A6058Lb_soluc ;
   private int GX_INS820 ;
   private int W6058Lb_soluc ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal W5558LB_CantC ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV10Lb_opcion ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String W396EmprCod ;
   private String A719PrdNum ;
   private String A14096Lb_fibra ;
   private String W5555Lb_opcion ;
   private String W719PrdNum ;
   private String Gx_emsg ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03D22_A396EmprCod ;
   private String[] P03D22_A5555Lb_opcion ;
   private int[] P03D22_A5532Lb_numero ;
   private short[] P03D22_A5556Lb_UltLC ;
   private String[] P03D23_A396EmprCod ;
   private int[] P03D23_A5532Lb_numero ;
   private String[] P03D23_A5555Lb_opcion ;
   private byte[] P03D23_A6544Lb_PTinC ;
   private int[] P03D23_A6058Lb_soluc ;
   private java.math.BigDecimal[] P03D23_A5558LB_CantC ;
   private String[] P03D23_A719PrdNum ;
   private short[] P03D23_A5557Lb_LineaC ;
   private String[] P03D23_A14096Lb_fibra ;
   private byte[] P03D23_A490ForPrdUMe ;
}

final  class pexiins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03D22", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltLC FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_opcion <> ?) ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03D23", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PTinC, Lb_soluc, LB_CantC, PrdNum, Lb_LineaC, Lb_fibra, ForPrdUMe FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03D24", "INSERT INTO TXPENS003(EmprCod, Lb_numero, Lb_opcion, Lb_LineaC, PrdNum, ForPrdUMe, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new UpdateCursor("P03D25", "UPDATE TXPENS002 SET Lb_UltLC=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

