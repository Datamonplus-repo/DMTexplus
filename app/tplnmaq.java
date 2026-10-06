package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tplnmaq", "/app.tplnmaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tplnmaq extends GXWebObjectStub
{
   public tplnmaq( )
   {
   }

   public tplnmaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tplnmaq.class ));
   }

   public tplnmaq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tplnmaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tplnmaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PLNMAQ";
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

