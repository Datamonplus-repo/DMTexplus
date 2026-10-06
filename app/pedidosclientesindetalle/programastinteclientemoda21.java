package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.programastinteclientemoda21", "/app.pedidosclientesindetalle.programastinteclientemoda21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programastinteclientemoda21 extends GXWebObjectStub
{
   public programastinteclientemoda21( )
   {
   }

   public programastinteclientemoda21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programastinteclientemoda21.class ));
   }

   public programastinteclientemoda21( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programastinteclientemoda21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programastinteclientemoda21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programas Tinte Cliente Moda21";
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

