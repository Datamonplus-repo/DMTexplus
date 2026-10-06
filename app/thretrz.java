package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thretrz", "/app.thretrz"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thretrz extends GXWebObjectStub
{
   public thretrz( )
   {
   }

   public thretrz( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thretrz.class ));
   }

   public thretrz( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thretrz_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thretrz_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MTO.PIEZAS ESTAMPACION";
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

