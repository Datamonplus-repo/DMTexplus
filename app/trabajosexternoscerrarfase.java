package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternoscerrarfase", "/app.trabajosexternoscerrarfase"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajosexternoscerrarfase extends GXWebObjectStub
{
   public trabajosexternoscerrarfase( )
   {
   }

   public trabajosexternoscerrarfase( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajosexternoscerrarfase.class ));
   }

   public trabajosexternoscerrarfase( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajosexternoscerrarfase_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajosexternoscerrarfase_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajos Externos (Cerrar Fase)";
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

