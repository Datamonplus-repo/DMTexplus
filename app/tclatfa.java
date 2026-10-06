package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclatfa", "/app.tclatfa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclatfa extends GXWebObjectStub
{
   public tclatfa( )
   {
   }

   public tclatfa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclatfa.class ));
   }

   public tclatfa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclatfa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclatfa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FACTOR ABSORCION CL-ART-S_H-MQ";
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

