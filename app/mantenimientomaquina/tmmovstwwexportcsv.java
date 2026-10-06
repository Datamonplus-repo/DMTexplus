package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmmovstwwexportcsv", "/app.mantenimientomaquina.tmmovstwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstwwexportcsv extends GXWebObjectStub
{
   public tmmovstwwexportcsv( )
   {
   }

   public tmmovstwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstwwexportcsv.class ));
   }

   public tmmovstwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMMov St WWExport CSV";
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

