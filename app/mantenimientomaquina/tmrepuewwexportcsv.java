package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrepuewwexportcsv", "/app.mantenimientomaquina.tmrepuewwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepuewwexportcsv extends GXWebObjectStub
{
   public tmrepuewwexportcsv( )
   {
   }

   public tmrepuewwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepuewwexportcsv.class ));
   }

   public tmrepuewwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepuewwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepuewwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRepue WWExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

