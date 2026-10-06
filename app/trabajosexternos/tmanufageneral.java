package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.tmanufageneral", "/app.trabajosexternos.tmanufageneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmanufageneral extends GXWebObjectStub
{
   public tmanufageneral( )
   {
   }

   public tmanufageneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmanufageneral.class ));
   }

   public tmanufageneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmanufageneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmanufageneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMANUFAGeneral";
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

