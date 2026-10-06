package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnormasdisnormwc", "/app.tnormasdisnormwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnormasdisnormwc extends GXWebObjectStub
{
   public tnormasdisnormwc( )
   {
   }

   public tnormasdisnormwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnormasdisnormwc.class ));
   }

   public tnormasdisnormwc( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnormasdisnormwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnormasdisnormwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNORMASDis Norm WC";
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

