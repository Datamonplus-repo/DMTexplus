package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.textper", "/app.textper"})
@jakarta.servlet.annotation.MultipartConfig
public final  class textper extends GXWebObjectStub
{
   public textper( )
   {
   }

   public textper( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( textper.class ));
   }

   public textper( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new textper_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new textper_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARANES EXTERNOS PERVAFIL";
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

