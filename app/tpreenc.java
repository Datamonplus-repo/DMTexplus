package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpreenc", "/app.tpreenc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpreenc extends GXWebObjectStub
{
   public tpreenc( )
   {
   }

   public tpreenc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpreenc.class ));
   }

   public tpreenc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpreenc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpreenc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO P/ENCOMENDA";
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

