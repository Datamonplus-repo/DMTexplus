package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pturnoi extends GXProcedure
{
   public pturnoi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pturnoi.class ), "" );
   }

   public pturnoi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     byte[] aP1 )
   {
      pturnoi.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pturnoi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pturnoi.this.AV15Turno = aP1[0];
      this.aP1 = aP1;
      pturnoi.this.AV20HisProDti = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21HorCar = GXutil.str( GXutil.hour( AV20HisProDti), 2, 0) + ":" + GXutil.str( GXutil.minute( AV20HisProDti), 2, 0) + ":" + GXutil.str( GXutil.second( AV20HisProDti), 2, 0) ;
      AV16Hora = (byte)(GXutil.lval( GXutil.substring( AV21HorCar, 1, 2))) ;
      AV17Min = (byte)(GXutil.lval( GXutil.substring( AV21HorCar, 4, 2))) ;
      /* Using cursor P03CK2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1162TurnHin = P03CK2_A1162TurnHin[0] ;
         n1162TurnHin = P03CK2_n1162TurnHin[0] ;
         A1164TurnHfi = P03CK2_A1164TurnHfi[0] ;
         n1164TurnHfi = P03CK2_n1164TurnHfi[0] ;
         A1163TurnMin = P03CK2_A1163TurnMin[0] ;
         n1163TurnMin = P03CK2_n1163TurnMin[0] ;
         A1165TurnMfi = P03CK2_A1165TurnMfi[0] ;
         n1165TurnMfi = P03CK2_n1165TurnMfi[0] ;
         A1161TurnCod = P03CK2_A1161TurnCod[0] ;
         if ( A1164TurnHfi >= A1162TurnHin )
         {
            if ( ( AV16Hora >= A1162TurnHin ) && ( AV16Hora <= A1164TurnHfi ) )
            {
               if ( ( AV16Hora == A1162TurnHin ) || ( AV16Hora == A1164TurnHfi ) )
               {
                  if ( ( AV16Hora == A1162TurnHin ) && ( AV17Min >= A1163TurnMin ) )
                  {
                     AV15Turno = A1161TurnCod ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  if ( ( AV16Hora == A1164TurnHfi ) && ( AV17Min <= A1165TurnMfi ) )
                  {
                     AV15Turno = A1161TurnCod ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
               else
               {
                  AV15Turno = A1161TurnCod ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         else
         {
            if ( ( ( AV16Hora <= A1164TurnHfi ) && ( AV16Hora <= A1162TurnHin ) ) || ( ( AV16Hora >= A1164TurnHfi ) && ( AV16Hora >= A1162TurnHin ) ) )
            {
               if ( ( AV16Hora == A1164TurnHfi ) && ( AV17Min > A1165TurnMfi ) )
               {
               }
               else
               {
                  AV15Turno = A1161TurnCod ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15Turno == 0 )
      {
         AV15Turno = (byte)(9) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pturnoi.this.A396EmprCod;
      this.aP1[0] = pturnoi.this.AV15Turno;
      this.aP2[0] = pturnoi.this.AV20HisProDti;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21HorCar = "" ;
      scmdbuf = "" ;
      P03CK2_A396EmprCod = new String[] {""} ;
      P03CK2_A1162TurnHin = new byte[1] ;
      P03CK2_n1162TurnHin = new boolean[] {false} ;
      P03CK2_A1164TurnHfi = new byte[1] ;
      P03CK2_n1164TurnHfi = new boolean[] {false} ;
      P03CK2_A1163TurnMin = new byte[1] ;
      P03CK2_n1163TurnMin = new boolean[] {false} ;
      P03CK2_A1165TurnMfi = new byte[1] ;
      P03CK2_n1165TurnMfi = new boolean[] {false} ;
      P03CK2_A1161TurnCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pturnoi__default(),
         new Object[] {
             new Object[] {
            P03CK2_A396EmprCod, P03CK2_A1162TurnHin, P03CK2_n1162TurnHin, P03CK2_A1164TurnHfi, P03CK2_n1164TurnHfi, P03CK2_A1163TurnMin, P03CK2_n1163TurnMin, P03CK2_A1165TurnMfi, P03CK2_n1165TurnMfi, P03CK2_A1161TurnCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Turno ;
   private byte AV16Hora ;
   private byte AV17Min ;
   private byte A1162TurnHin ;
   private byte A1164TurnHfi ;
   private byte A1163TurnMin ;
   private byte A1165TurnMfi ;
   private byte A1161TurnCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV21HorCar ;
   private String scmdbuf ;
   private java.util.Date AV20HisProDti ;
   private boolean n1162TurnHin ;
   private boolean n1164TurnHfi ;
   private boolean n1163TurnMin ;
   private boolean n1165TurnMfi ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03CK2_A396EmprCod ;
   private byte[] P03CK2_A1162TurnHin ;
   private boolean[] P03CK2_n1162TurnHin ;
   private byte[] P03CK2_A1164TurnHfi ;
   private boolean[] P03CK2_n1164TurnHfi ;
   private byte[] P03CK2_A1163TurnMin ;
   private boolean[] P03CK2_n1163TurnMin ;
   private byte[] P03CK2_A1165TurnMfi ;
   private boolean[] P03CK2_n1165TurnMfi ;
   private byte[] P03CK2_A1161TurnCod ;
}

final  class pturnoi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CK2", "SELECT EmprCod, TurnHin, TurnHfi, TurnMin, TurnMfi, TurnCod FROM TXPTURNOS WHERE EmprCod = ? ORDER BY EmprCod, TurnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
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
               return;
      }
   }

}

