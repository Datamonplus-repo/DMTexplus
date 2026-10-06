package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workaroundasignarclaves extends GXProcedure
{
   public workaroundasignarclaves( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workaroundasignarclaves.class ), "" );
   }

   public workaroundasignarclaves( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String aP4 ,
                        byte aP5 ,
                        java.math.BigDecimal aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        String aP9 ,
                        String aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 ,
                             byte aP5 ,
                             java.math.BigDecimal aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             String aP9 ,
                             String aP10 )
   {
      workaroundasignarclaves.this.A396EmprCod = aP0;
      workaroundasignarclaves.this.A764ProForCod = aP1;
      workaroundasignarclaves.this.AV15ProForLin = aP2;
      workaroundasignarclaves.this.AV18ProForPrd = aP3;
      workaroundasignarclaves.this.AV19ProForDes = aP4;
      workaroundasignarclaves.this.AV20ForPrdUMe = aP5;
      workaroundasignarclaves.this.AV21ProForCan = aP6;
      workaroundasignarclaves.this.AV16ProForNro = aP7;
      workaroundasignarclaves.this.AV17ProForTnq = aP8;
      workaroundasignarclaves.this.AV9ProForCla = aP9;
      workaroundasignarclaves.this.AV12ProForClv = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (0==AV15ProForLin) )
      {
         AV24GXLvl2 = (byte)(0) ;
         /* Using cursor P08LU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(AV15ProForLin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A767ProForLin = P08LU2_A767ProForLin[0] ;
            A770ProForPrd = P08LU2_A770ProForPrd[0] ;
            A765ProForDes = P08LU2_A765ProForDes[0] ;
            A490ForPrdUMe = P08LU2_A490ForPrdUMe[0] ;
            A762ProForCan = P08LU2_A762ProForCan[0] ;
            A1645ProForNro = P08LU2_A1645ProForNro[0] ;
            A3379ProForTnq = P08LU2_A3379ProForTnq[0] ;
            A763ProForCla = P08LU2_A763ProForCla[0] ;
            A5358ProForClv = P08LU2_A5358ProForClv[0] ;
            AV24GXLvl2 = (byte)(1) ;
            if ( ! ( GXutil.strcmp(A770ProForPrd, AV18ProForPrd) == 0 ) )
            {
               A770ProForPrd = AV18ProForPrd ;
            }
            if ( ! ( GXutil.strcmp(A765ProForDes, AV19ProForDes) == 0 ) )
            {
               A765ProForDes = AV19ProForDes ;
            }
            if ( ! ( A490ForPrdUMe == AV20ForPrdUMe ) )
            {
               A490ForPrdUMe = AV20ForPrdUMe ;
            }
            if ( ! ( DecimalUtil.compareTo(A762ProForCan, AV21ProForCan) == 0 ) )
            {
               A762ProForCan = AV21ProForCan ;
            }
            if ( ! ( A1645ProForNro == AV16ProForNro ) )
            {
               A1645ProForNro = AV16ProForNro ;
            }
            if ( ! ( A3379ProForTnq == AV17ProForTnq ) )
            {
               A3379ProForTnq = AV17ProForTnq ;
            }
            A763ProForCla = AV9ProForCla ;
            A5358ProForClv = AV12ProForClv ;
            /* Using cursor P08LU3 */
            pr_default.execute(1, new Object[] {A770ProForPrd, A765ProForDes, Byte.valueOf(A490ForPrdUMe), A762ProForCan, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A763ProForCla, A5358ProForClv, A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV24GXLvl2 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPLPROFO

            */
            A767ProForLin = AV15ProForLin ;
            A770ProForPrd = AV18ProForPrd ;
            A765ProForDes = AV19ProForDes ;
            A490ForPrdUMe = AV20ForPrdUMe ;
            A762ProForCan = AV21ProForCan ;
            A1645ProForNro = AV16ProForNro ;
            A3379ProForTnq = AV17ProForTnq ;
            A763ProForCla = AV9ProForCla ;
            A5358ProForClv = AV12ProForClv ;
            /* Using cursor P08LU4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, Byte.valueOf(A490ForPrdUMe), A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A765ProForDes});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
            /* End Insert */
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "workaroundasignarclaves");
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
      P08LU2_A396EmprCod = new String[] {""} ;
      P08LU2_A764ProForCod = new String[] {""} ;
      P08LU2_A767ProForLin = new short[1] ;
      P08LU2_A770ProForPrd = new String[] {""} ;
      P08LU2_A765ProForDes = new String[] {""} ;
      P08LU2_A490ForPrdUMe = new byte[1] ;
      P08LU2_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LU2_A1645ProForNro = new byte[1] ;
      P08LU2_A3379ProForTnq = new byte[1] ;
      P08LU2_A763ProForCla = new String[] {""} ;
      P08LU2_A5358ProForClv = new String[] {""} ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.workaroundasignarclaves__default(),
         new Object[] {
             new Object[] {
            P08LU2_A396EmprCod, P08LU2_A764ProForCod, P08LU2_A767ProForLin, P08LU2_A770ProForPrd, P08LU2_A765ProForDes, P08LU2_A490ForPrdUMe, P08LU2_A762ProForCan, P08LU2_A1645ProForNro, P08LU2_A3379ProForTnq, P08LU2_A763ProForCla,
            P08LU2_A5358ProForClv
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

   private byte AV20ForPrdUMe ;
   private byte AV16ProForNro ;
   private byte AV17ProForTnq ;
   private byte AV24GXLvl2 ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private short AV15ProForLin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int GX_INS90 ;
   private java.math.BigDecimal AV21ProForCan ;
   private java.math.BigDecimal A762ProForCan ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV18ProForPrd ;
   private String AV19ProForDes ;
   private String AV9ProForCla ;
   private String AV12ProForClv ;
   private String scmdbuf ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private String[] P08LU2_A396EmprCod ;
   private String[] P08LU2_A764ProForCod ;
   private short[] P08LU2_A767ProForLin ;
   private String[] P08LU2_A770ProForPrd ;
   private String[] P08LU2_A765ProForDes ;
   private byte[] P08LU2_A490ForPrdUMe ;
   private java.math.BigDecimal[] P08LU2_A762ProForCan ;
   private byte[] P08LU2_A1645ProForNro ;
   private byte[] P08LU2_A3379ProForTnq ;
   private String[] P08LU2_A763ProForCla ;
   private String[] P08LU2_A5358ProForClv ;
}

final  class workaroundasignarclaves__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LU2", "SELECT EmprCod, ProForCod, ProForLin, ProForPrd, ProForDes, ForPrdUMe, ProForCan, ProForNro, ProForTnq, ProForCla, ProForClv FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? and ProForLin = ? ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08LU3", "UPDATE TXPLPROFO SET ProForPrd=?, ProForDes=?, ForPrdUMe=?, ProForCan=?, ProForNro=?, ProForTnq=?, ProForCla=?, ProForClv=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new UpdateCursor("P08LU4", "INSERT INTO TXPLPROFO(EmprCod, ProForCod, ProForLin, ProForPrd, ForPrdUMe, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForDes, ProForCPo, ProForFT, ProForDe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 30);
               stmt.setString(11, (String)parms[10], 26);
               return;
      }
   }

}

