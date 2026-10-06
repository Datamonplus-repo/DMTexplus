package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.tmanufa", "/app.trabajosexternos.tmanufa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmanufa extends GXWebObjectStub
{
   public tmanufa( )
   {
   }

   public tmanufa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmanufa.class ));
   }

   public tmanufa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmanufa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmanufa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Manufacturadores";
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

