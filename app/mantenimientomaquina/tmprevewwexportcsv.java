package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmprevewwexportcsv", "/app.mantenimientomaquina.tmprevewwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevewwexportcsv extends GXWebObjectStub
{
   public tmprevewwexportcsv( )
   {
   }

   public tmprevewwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevewwexportcsv.class ));
   }

   public tmprevewwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevewwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevewwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Preventivo";
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

