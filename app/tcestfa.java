package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcestfa", "/app.tcestfa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcestfa extends GXWebObjectStub
{
   public tcestfa( )
   {
   }

   public tcestfa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcestfa.class ));
   }

   public tcestfa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcestfa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcestfa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANT FORMULAS TRAVER";
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

