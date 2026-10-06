package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmsolicwwexportcsv", "/app.mantenimientomaquina.tmsolicwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicwwexportcsv extends GXWebObjectStub
{
   public tmsolicwwexportcsv( )
   {
   }

   public tmsolicwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicwwexportcsv.class ));
   }

   public tmsolicwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMSolic WWExport CSV";
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

