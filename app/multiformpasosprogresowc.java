package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.multiformpasosprogresowc", "/app.multiformpasosprogresowc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class multiformpasosprogresowc extends GXWebObjectStub
{
   public multiformpasosprogresowc( )
   {
   }

   public multiformpasosprogresowc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( multiformpasosprogresowc.class ));
   }

   public multiformpasosprogresowc( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new multiformpasosprogresowc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new multiformpasosprogresowc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Progreso en pasos";
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

